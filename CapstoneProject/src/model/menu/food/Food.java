package model.menu.food;

import model.menu.ConsumptionTime;
import model.menu.PreparationTime;

public abstract class Food implements PreparationTime, ConsumptionTime {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
