package model.menu.beverage;

import model.menu.PreparationTime;
import model.menu.ConsumptionTime;

public abstract class Beverage implements PreparationTime, ConsumptionTime {
    private String name;

    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
