package model.menu;

import exception.EnoughOrderRequestException;
import model.Order;
import model.menu.beverage.Beverage;
import model.menu.beverage.MineralWater;
import model.menu.beverage.OrangeJuice;
import model.menu.food.Food;
import model.menu.food.Rice;
import model.menu.food.Salad;
import model.menu.food.Steak;
import utils.Emoji;
import utils.FoodAndBeverage;

import java.util.ArrayList;
import java.util.Random;

public class Menu {
	private ArrayList<Food> foodChoices = new ArrayList<>();
	private Beverage beveragesChoice = null;

	/**
	 * müşteriye gösterilen menu bu şekildedir
	 */
	private void showMenu() {
		System.out.println("------------ MENU ------------");
		System.out.println("Enter 1 for Steak");
		System.out.println("Enter 2 for Rice");
		System.out.println("Enter 3 for Salad");
		System.out.println("Enter 4 for Orange Juice");
		System.out.println("Enter 5 for Mineral Water");
		System.out.println("Enter 0 for Exit");
		System.out.println("------------------------------");
	}

	private Order getOrder() {
		return new Order(foodChoices, beveragesChoice);
	}

	private Boolean isEnoughOrderRequest(int choice) {
		return (foodChoices.size() == 2 && (choice == FoodAndBeverage.STEAK.getID() || choice == FoodAndBeverage.RICE.getID()
				|| choice == FoodAndBeverage.SALAD.getID())) || (beveragesChoice != null && (choice == FoodAndBeverage.ORANGE_JUICE.getID()
				|| choice == FoodAndBeverage.MINERAL_WATER.getID()));
	}

	/**
	 * müşteriye random olarak menuden seçimler yaptırılır
	 * @return müşterinin seçmiş olduğu yemekler ve içeceklerden oluşan order
	 */
	public Order makeChoice() {
		int exit = 0;
		Random random = new Random();

		foodChoices = new ArrayList<>();
		beveragesChoice = null;

		int choice = -1;
		while (choice != exit) {
			if (foodChoices.size() == 2 && beveragesChoice != null) break;
			choice = random.nextInt(6);

			if (isEnoughOrderRequest(choice)) { // müşteri 2 yemek ve 1 içecekten fazla seçim yaparsa exception fırlatılır
				try {
					throw new EnoughOrderRequestException(Emoji.ERROR + " Enough Order Request");
				} catch (EnoughOrderRequestException e) {
					System.out.println(e.getMessage());
					break;
				}
			} else {
				switch (choice) {
					case 1 -> foodChoices.add(new Steak());
					case 2 -> foodChoices.add(new Rice());
					case 3 -> foodChoices.add(new Salad());
					case 4 -> beveragesChoice = new OrangeJuice();
					case 5 -> beveragesChoice = new MineralWater();
				}
			}
		}
		if (beveragesChoice != null || foodChoices.size() != 0) return getOrder();

		return null;
	}
}
