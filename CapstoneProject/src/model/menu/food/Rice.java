package model.menu.food;

public class Rice extends Food {
    public Rice() {
        super("Rice");
    }

    @Override
    public long getPreparationTime() {
        return 2000;
    }

    @Override
    public long getConsumptionTime() {
        return 1500;
    }
}
