package model.menu.beverage;

public class OrangeJuice extends Beverage {

    public OrangeJuice() {
        super("Orange Juice");
    }

    @Override
    public long getPreparationTime() {
        return 1000;
    }

    @Override
    public long getConsumptionTime() {
        return 1000;
    }
}
