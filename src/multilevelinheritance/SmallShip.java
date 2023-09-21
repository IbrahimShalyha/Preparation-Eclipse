package multilevelinheritance;

public class SmallShip extends BigShip {
	int price2;
	String model2;

	public SmallShip(String brand, String color, int passengerCapacity, int price, String model, int price1,
			String model1, int price2, String model2) {
		super(brand, color, passengerCapacity, price, model, price1, model1);
		this.price2 = price2;
		this.model2 = model2;
	}

	public String toString() {
		return super.toString() + " " + "PRICE 2 = " + price2 + " " + "MODEL 2 = " + model2;
	}
}
