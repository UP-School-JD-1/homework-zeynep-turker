package model.staff;

import model.customer.Customer;
import model.restaurant.Restaurant;
import utils.Emoji;

public class Waiter implements Runnable {
	private final String name;

	public Waiter(String name) {
		this.name = name;
	}

	/**
	 * readyOrders'dan hazır olan sipariş alınır ve
	 * siparişi veren müşteri nesnesine bildirilir (notify)
	 */
	private void deliverReadyOrder() {
		Customer customer;
		synchronized (Restaurant.readyOrders) {
			customer = Restaurant.readyOrders.poll();
		}
		if (customer != null) {
			synchronized (customer) {
				customer.notify();
				System.out.println(Emoji.WAITER + " Waiter " + name + " delivered the order to customer " + customer.getName() + ".");
			}
		}
	}

	/**
	 * ready queue'sinde hazır sipariş varsa müşteriye teslim edilir
	 * aksi takdirde readyOrder nesnesine wait yapılarak hazır bir sipariş gelmesi beklenir
	 */
	private void waitReadyOrder() throws InterruptedException {
		synchronized (Restaurant.readyOrders) {
			System.out.println(Emoji.WAITER + " Waiter " + name + " is waiting order from chefs.");
			Restaurant.readyOrders.wait();
		}
		deliverReadyOrder();
	}

	/**
	 * gelen sipariş, hungryCustomer queue'sinden alınır. (Queue kullanılmasının amacı, ilk verilen siparişin
	 * şeflere ilk ileticek olmasıdır)
	 * alınan order nesnesi, orders queue'sine eklenir ve şefler de bu queue'ye ilk eklenen siparişi alır ve ilk olarak
	 * o siparişi yapmaya başlar
	 * order nesnesi notify edilerek şeflere siparişin geldiği bildirilir
	 */
	private void transmitOrder() throws InterruptedException {
		if (Restaurant.remainCustomer != 0) {
			Customer servedCustomer;
			synchronized (Restaurant.hungryCustomers) {
				servedCustomer = Restaurant.hungryCustomers.poll();
			}

			if (servedCustomer != null) {
				synchronized (Restaurant.orders) {
					Restaurant.orders.add(servedCustomer);
					Thread.sleep(1000);
					System.out.println(Emoji.WAITER + " Waiter " + name + " transmitted waiter customer " + servedCustomer.getName() + "'s order to chefs.");
					Restaurant.orders.notify();
				}
				waitReadyOrder(); // sipariş verildikten sonra hazır bir sipariş beklenir
			}
		}
	}

	/**
	 * müşterilerden gelecek sipariş beklenir
	 */
	private void waitOrder() throws InterruptedException {
		synchronized (Restaurant.hungryCustomers) {
			while (Restaurant.hungryCustomers.isEmpty()) {
				if (Restaurant.remainCustomer == 0) return;
				System.out.println(Emoji.WAITER + " Waiter " + name + " is waiting for order.");
				Restaurant.hungryCustomers.wait();
			}
		}
	}

	/**
	 * bekleyen hazır bir sipariş varsa müşteriye teslim edilir
	 * müşteriden sipariş beklenir
	 * alınan sipariş şeflere iletilir
	 */
	private void serveCustomer() throws InterruptedException {
		if (!Restaurant.readyOrders.isEmpty()) {
			deliverReadyOrder();
		}
		synchronized (Restaurant.remainCustomer) { // restoranda müşteri kalmadıysa işleme devam edilmez
			if (Restaurant.remainCustomer == 0) return;
		}

		waitOrder(); // müşterilerden gelecek sipariş beklenir
		transmitOrder(); // gelen siparişi şeflere iletilir
	}


	@Override
	public void run() {
		try {
			// restoranda hiç müşteri kalmayana kadar garsonlar çalışmaya devam eder
			while (Restaurant.remainCustomer != 0) {
				serveCustomer();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Emoji.WAITER + " Waiter " + name + " left the restaurant.");
	}
}
