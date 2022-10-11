package utils;

public enum FoodAndBeverage {
	STEAK(1),
	RICE(2),
	SALAD(3),
	ORANGE_JUICE(4),
	MINERAL_WATER(5);

	private final int ID;

	FoodAndBeverage(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return this.ID;
	}
}
