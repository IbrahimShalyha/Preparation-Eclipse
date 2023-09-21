package homework;

public class Bag {
	private String brand;
	private int price;
	private int noOfZips;
	private Zip zip;

	public Bag(String brand, int price, int noOfZips, Zip zip) {
		this.brand = brand;
		this.price = price;
		this.noOfZips = noOfZips;
		this.zip = zip;
	}

	public String toString() {
		return brand + " " + price + " " + noOfZips+" "+zip;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setnoOfZips(int noOfZips) {
		this.noOfZips = noOfZips;
	}

	public int getnoOfZips() {
		return noOfZips;
	}
}
