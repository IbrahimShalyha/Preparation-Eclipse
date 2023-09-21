package constructor;

public class Laptop {
	private String brand;
	private int price;
	private int ram;

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

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRam() {
		return ram;
	}

	public Laptop(String brand, int price, int ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
}
