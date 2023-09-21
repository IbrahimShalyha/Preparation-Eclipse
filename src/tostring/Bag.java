package tostring;

public class Bag {
	private int price;
	private String brand;
	private int noOfZips;

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setNoOfZips(int noOfZips) {
		this.noOfZips = noOfZips;
	}

	public Bag(int price, String brand, int noOfZips) {
		this.price = price;
		this.brand = brand;
		this.noOfZips = noOfZips;
	}

	public String toString() {
		return " " + price + " " + brand + " " + noOfZips;
	}
}
