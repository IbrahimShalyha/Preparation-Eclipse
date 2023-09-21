package inheritance;

public class Flower {
	String name;
	String season;
	int price;

	public Flower(String name, String season, int price) {
		this.name = name;
		this.season = season;
		this.price = price;
	}

	public String toString() {
		return "NAME = " + name + " " + "SEASON = " + season + " " + "PRICE = "+price;
	}

}
