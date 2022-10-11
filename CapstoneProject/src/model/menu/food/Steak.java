package model.menu.food;

public class Steak extends Food {

    public Steak() {
        super("Steak");
    }

    @Override
    public long getPreparationTime() {
        return 3000;
    }

    @Override
    public long getConsumptionTime() {
        return 2000;
    }
}
