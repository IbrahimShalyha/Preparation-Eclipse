package inheritance;

public class Dress {
	String brand;
	String color;
	int star;

	public Dress(String brand, String color, int star) {
		this.brand = brand;
		this.color = color;
		this.star = star;
	}

	public String toString() {
		return "BRAND = " + brand + " " + "COLOR = " + color + " " + "STAR = " + star;
	}
}
