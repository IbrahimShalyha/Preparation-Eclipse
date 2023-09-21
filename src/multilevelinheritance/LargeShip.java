package multilevelinheritance;

public class LargeShip extends TransportVehicle {
	int price;
	String model;

	public LargeShip(String shipname, String color, int passengerCapacity, int price, String model) {
		super(shipname, color, passengerCapacity);
		this.price = price;
		this.model = model;
	}

	public String toString() {
		return super.toString() + " " + "PRICE = " + price + " " + "MODEL = " + model;
	}

}
