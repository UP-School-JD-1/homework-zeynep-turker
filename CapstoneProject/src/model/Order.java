package model;

import model.menu.beverage.Beverage;
import model.menu.food.Food;

import java.util.ArrayList;

public class Order {
    private final ArrayList<Food> foods;
    private final Beverage beverage;

    public Order(ArrayList<Food> foods, Beverage beverage) {
        this.foods = foods;
        this.beverage = beverage;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Order : ");
        for (Food food : foods) info.append(food.getName()).append(" ");
        if (beverage != null)
            info.append(beverage.getName());
        return info.toString();
    }
}
