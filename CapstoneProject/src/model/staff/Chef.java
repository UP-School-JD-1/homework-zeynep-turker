package model.staff;

import model.Order;
import model.customer.Customer;
import model.restaurant.Restaurant;
import utils.Emoji;

public class Chef implements Runnable {
	private final String name;
	private Order order;
	private Customer customer;

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * hazırlanan sipariş, readyOrder'a eklenir ve garsonlara siparişin hazır olduğu bildirilir
	 */
	private void notifyOrder() {
		synchronized (Restaurant.readyOrders) {
			Restaurant.readyOrders.add(customer);
			System.out.println(Emoji.CHEF + " Chef " + name + " passed " + customer.getName() + "'s order to waiter");
			Restaurant.readyOrders.notify();
		}
	}

	/**
	 * şef threadi, alınan siparişteki yemekler ve içecekler hazırlanma süreleri kadar uyutulur
	 */
	private void prepare() throws InterruptedException {
		if (order != null) {
			System.out.println(Emoji.CHEF + " Chef " + name + " is starting to cook " + order);
			for (int i = 0; i < order.getFoods().size(); ++i) {
				System.out.println(Emoji.CHEF + " Chef " + name + " is preparing " + order.getFoods().get(i).getName());
				Thread.sleep(order.getFoods().get(i).getPreparationTime());
			}
			if (order.getBeverage() != null) {
				System.out.println(Emoji.CHEF + " Chef " + name + " is preparing " + order.getBeverage().getName());
				Thread.sleep(order.getBeverage().getPreparationTime());
			}
			System.out.println(Emoji.CHEF + " Chef " + name + " finished " + customer.getName() + "'s order.");
			notifyOrder(); // sipariş hazılandığı garsonlara bildirilir
			order = null;
		}
	}

	/**
	 * orders queue'indeki ilk eleman alınır
	 */
	private void getOrder() {
		synchronized (Restaurant.orders) {
			if (!Restaurant.orders.isEmpty()) {
				if (Restaurant.remainCustomer != 0) {
					customer = Restaurant.orders.poll();
					if (customer != null && customer.getOrder() != null) {
						order = customer.getOrder();
					}
				} else {
					Restaurant.orders.notify();
				}
			}
		}
	}

	/**
	 * orders listesi boş ise siparişin gelmesi beklenir
	 */
	private void waitOrder() throws InterruptedException {
		synchronized (Restaurant.orders) {
			while (Restaurant.orders.isEmpty()) {
				System.out.println(Emoji.CHEF + " Chef " + name + " is waiting for the waiters to bring order.");
				if (Restaurant.remainCustomer == 0) return;
				Restaurant.orders.wait();
			}
		}
	}

	private void prepareOrder() throws InterruptedException {
		// eğer restoranda müşteri kalmadıysa işleme devam edilmez
		synchronized (Restaurant.remainCustomer) {
			if (Restaurant.remainCustomer == 0) return;
		}
		waitOrder(); // siparişin gelmesi beklenir
		getOrder(); // gelen sipariş alınır
		prepare(); // sipariş hazırlanır
	}

	@Override
	public void run() {
		try {
			// restoranda hiç müşteri kalmayana kadar şefler çalışmaya devam eder
			while (Restaurant.remainCustomer != 0) {
				prepareOrder();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Emoji.CHEF + " Chef " + name + " left the restaurant");
	}
}
