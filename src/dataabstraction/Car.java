package dataabstraction;

abstract public class Car {
	public String Brand(String brand) {
		return "Car Brand Is" + " " + brand;
	}

	public int Price(int price) {
		return price;
	}

	abstract public String Color();
}
