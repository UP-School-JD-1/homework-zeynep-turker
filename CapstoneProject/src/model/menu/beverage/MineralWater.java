package model.menu.beverage;

public class MineralWater extends Beverage {
    public MineralWater() {
        super("Mineral Water");
    }

    @Override
    public long getPreparationTime() {
        return 1500;
    }

    @Override
    public long getConsumptionTime() {
        return 1000;
    }
}
