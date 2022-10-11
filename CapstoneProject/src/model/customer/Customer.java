package model.customer;

import model.Order;
import model.Table;
import model.menu.Menu;
import model.restaurant.Restaurant;
import utils.Emoji;

public class Customer implements Runnable {
	private final String name;
	private Table table;
	private Order order;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Order getOrder() {
		return order;
	}

	/**
	 * müşteri, restorandan ayrılır
	 * müşterinin tutmuş olduğu masa tekrardan müsait masalar arasına eklenir ve diğer müşterilere bildirilir
	 * kalan müşterilerden bir azaltılır. Hiç müşteri kalmadıysa şeflere ve garsonlara bildirilir
	 */
	private void leaveRestaurant() {
		System.out.println(Emoji.CUSTOMER + " Customer " + name + " left the restaurant.");
		synchronized (Restaurant.availableTable) {
			Restaurant.availableTable.add(table);
			Restaurant.availableTable.notify();
		}
		synchronized (Restaurant.remainCustomer) {
			Restaurant.remainCustomer--;
			if (Restaurant.remainCustomer == 0) {
				synchronized (Restaurant.orders) {
					Restaurant.orders.notifyAll();
				}
				synchronized (Restaurant.hungryCustomers) {
					Restaurant.hungryCustomers.notifyAll();
				}
			}
		}
	}

	/**
	 * müşteri threadi, söylemiş olduğu siparişteki yemeklerin ve içeceklerin tüketilme sürelerine göre
	 * sleep methodu ile uyutulur
	 */
	private void eatAndDrinkOrder() throws InterruptedException {
		System.out.println(Emoji.CUSTOMER + " Customer " + name + "'s order has arrived.");
		for (int i = 0; i < order.getFoods().size(); ++i) {
			System.out.println(Emoji.CUSTOMER + " Customer " + name + " is eating " + order.getFoods().get(i).getName() + ".");
			Thread.sleep(order.getFoods().get(i).getConsumptionTime());
		}
		if (order.getBeverage() != null) {
			System.out.println(Emoji.CUSTOMER + " Customer " + name + " is drinking " + order.getBeverage().getName() + ".");
			Thread.sleep(order.getBeverage().getConsumptionTime());
		}
		System.out.println(Emoji.CUSTOMER + " Customer " + name + " finished eating and drinking.");
		leaveRestaurant(); //müşteri, yemeğini bitirdikten sonra restorandan ayrılır
	}

	/**
	 * her müşteri siparişini verdikten sonra kendisinin wait methoduyla beklemeye geçer
	 * garson siparişi getirdikten sonra ise müşteri siparişi yemeğe başlar
	 */
	private void waitOrder() throws InterruptedException {
		synchronized (this) {
			System.out.println(Emoji.CUSTOMER + " Customer " + name + " is waiting to order");
			this.wait();
		}
		eatAndDrinkOrder();
	}

	/**
	 * müşteri menuden rastgele olarak seçimlerini yapar ve siparişi garsona ulaştırır
	 */
	private void placeOrder() throws InterruptedException {
		Order order;
		Menu menu = new Menu();
		synchronized (Restaurant.hungryCustomers) {
			order = menu.makeChoice();
			if (order != null) {
				System.out.print(Emoji.CUSTOMER + " Customer " + name + " gave the order ");
				for (int i = 0; i < order.getFoods().size(); ++i) {
					System.out.print(order.getFoods().get(i).getName() + ", ");
				}
				if (order.getBeverage() != null) {
					System.out.print(order.getBeverage().getName());
				}
				System.out.println();
				this.order = order; // siparişi müşteriye atanır
				Restaurant.hungryCustomers.add(this); // müşteri aç müşteriler queue sina eklenir.
				Restaurant.hungryCustomers.notify(); // müşterinin sipariş verdiği garsonlara bildirilir
			}
		}
		if (order != null) waitOrder(); // müşteri sipariş verdiyse beklemeye geçer
		else {
			System.out.println(Emoji.CUSTOMER + " Customer " + name + " did not give order and left the restaurant");
			leaveRestaurant(); // sipariş verilmediyse restorandan çıkış yapılır
		}
	}

	/**
	 * müşteri restorandan çıkış yapar
	 * kalan müşteri sayısı bir azaltılır
	 */
	private void exitRestaurant() {
		System.out.println(Emoji.CUSTOMER + " Customer " + name + " left the restaurant");
		synchronized (Restaurant.remainCustomer) { // birçok thread bu değişken üzerinde yazma işlemi yaptığı için syronized içine alındı
			Restaurant.remainCustomer--;
		}
	}

	/**
	 * eğer random sayı 0.8 den büyük ise true return eder (bu müşterinin restorandan çıkış yapmasını sağlar)
	 * aksi takdir de false return edilir (böylece müşteri masaların boşalmasını bekler)
	 *
	 * @return boolean
	 */
	private boolean willExitRestaurant() {
		return Math.random() > 0.8;
	}

	/**
	 * boş masa varsa oturur
	 * yoksa müşteri willExitRestaurant methodundan gelen değere göre restorandan çıkış yapar
	 * veya masaların boşalmasını bekler
	 */
	private void sitDownTable() throws InterruptedException {
		synchronized (Restaurant.availableTable) {
			while (Restaurant.availableTable.isEmpty()) {
				if (willExitRestaurant()) {
					exitRestaurant();
					return;
				}
				Restaurant.availableTable.wait(); // müşteri masanın boşalmasını bekler
			}
			table = Restaurant.availableTable.poll(); // boş masa bulunduğunda, müsait olan masa queue'den çıkarılır
			System.out.println(Emoji.CUSTOMER + " Customer " + name + " sat down at the table " + table.getId() + ".");
		}
		placeOrder(); // müşteri masaya oturur
	}

	/**
	 * müşteri restorana giriş yapar
	 */
	private void enterRestaurant() throws InterruptedException {
		System.out.println(Emoji.CUSTOMER + " Customer " + name + " entered the restaurant.");
		this.sitDownTable();
	}

	/**
	 * 2 saniyede bir müşterilerin restorana girmesi sağlanır
	 */
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			enterRestaurant();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
