package multilevelinheritance;

public class BigShip extends LargeShip {
	int price1;
	String model1;

	public BigShip(String brand, String color, int passengerCapacity, int price, String model, int price1,
			String model1) {
		super(brand, color, passengerCapacity, price, model);
		this.price1 = price1;
		this.model1 = model1;
	}

	public String toString() {
		return super.toString() + " " + "PRICE 1 = " + price1 + " " + "MODEL 1 = " + model1;
	}
}
