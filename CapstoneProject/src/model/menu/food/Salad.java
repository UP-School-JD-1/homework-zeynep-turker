package model.menu.food;

public class Salad extends Food {

    public Salad() {
        super("Salad");
    }

    @Override
    public long getPreparationTime() {
        return 2000;
    }

    @Override
    public long getConsumptionTime() {
        return 1000;
    }
}
