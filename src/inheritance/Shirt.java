package inheritance;

public class Shirt extends Dress {
	int price;
	boolean isCotton;

	public Shirt(String brand, String color, int star, int price, boolean isCotton) {
		super(brand, color, star);
		this.price = price;
		this.isCotton = isCotton;
	}

	public String toString() {  
		return super.toString() + " " + "PRICE = " + price + " " + "IS COTTON = " + isCotton;
	}
}
