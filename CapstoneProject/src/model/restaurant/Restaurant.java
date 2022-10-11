package model.restaurant;

import exception.WaiterNumberBiggerThanChefNumberException;
import model.staff.Chef;
import model.customer.Customer;
import model.Table;
import model.staff.Waiter;
import utils.Emoji;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
    private final int tableNumber;
    private final int customerNumber;
    private final int chefNumber;
    private final int waiterNumber;

    private Thread[] customerThreads;
    private Thread[] waiterThreads;
    private Thread[] chefThreads;

    public static Integer remainCustomer = 0; // restoranda kalan müşterilerin sayısı
    public static final Queue<Table> availableTable = new LinkedList<>(); // müsait olan masaların tutulduğu queue
    public static final Queue<Customer> hungryCustomers = new LinkedList<>(); // aç müşterilerin tutulduğu queue
    public static final Queue<Customer> orders = new LinkedList<>(); // siparişlerin tutulduğu queue
    public static final Queue<Customer> readyOrders = new LinkedList<>(); // hazır olan siparişlerin tutulduğu queue

    public Restaurant(int customerNumber, int waiterNumber, int chefNumber, int tableNumber) {
        this.customerNumber = customerNumber;
        this.waiterNumber = waiterNumber;
        this.chefNumber = chefNumber;
        remainCustomer = customerNumber;
        this.tableNumber = tableNumber;
    }

    /**
     * müşteri, garson ve şef threadleri çalıştırılır
     */
    private void openRestaurant() {
        for (int i = 0; i < customerNumber; i++) {
            customerThreads[i].start();
        }
        for (int j = 0; j < waiterNumber; j++) {
            waiterThreads[j].start();
        }
        for (int j = 0; j < chefNumber; j++) {
            chefThreads[j].start();
        }
    }

    /**
     * restorandaki bütün masalar müsait olarak belirlenir
     */
    private void createTables() {
        for (int i = 1; i <= tableNumber; i++) {
            availableTable.add(new Table(i));
        }
    }

    /**
     * garson threadlerini tutan arraye garson nesneleri oluşturulup atılır
     */
    private void createWaiters() {
        waiterThreads = new Thread[waiterNumber];

        for (int i = 0; i < waiterNumber; i++) {
            String waiterName = "Waiter" + (i + 1);
            Waiter waiter = new Waiter(waiterName);
            waiterThreads[i] = new Thread(waiter);
        }
    }

    /**
     * müşteri threadlerini tutan arraye müşteri nesneleri oluşturulup atılır
     */
    private void createCustomers() {
        customerThreads = new Thread[customerNumber];

        for (int i = 0; i < customerNumber; i++) {
            String customerName = "Customer" + (i + 1);
            Customer customer = new Customer(customerName);
            customerThreads[i] = new Thread(customer);
        }
    }

    /**
     * şef threadlerini tutan arraye şef nesneleri oluşturulup atılır
     */
    private void createChefs() {
        chefThreads = new Thread[chefNumber];

        for (int i = 0; i < chefNumber; i++) {
            String chefName = "Chef" + (i + 1);
            Chef chef = new Chef(chefName);
            chefThreads[i] = new Thread(chef);
        }
    }

    /**
     * eğer garson sayısı, şef sayından küçük ise exception fırlatılıp program sonlanır
     * aksi takdirde restorandaki masalar, şefler, garsonlar ve müşteriler oluşturulup
     * restorandaki işlerin akışı başlatılır
     */
    public void start() {
        try {
            if (this.waiterNumber < this.chefNumber)
                throw new WaiterNumberBiggerThanChefNumberException(Emoji.ERROR + " Waiter number must be bigger than chef number");
        } catch (WaiterNumberBiggerThanChefNumberException e) {
            System.out.println(e.getMessage());
            return;
        }

        createTables();
        createChefs();
        createWaiters();
        createCustomers();
        openRestaurant();
    }
}
