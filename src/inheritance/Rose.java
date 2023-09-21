package inheritance;

public class Rose extends Flower {
	String color;
	int duration;

	public Rose(String name, String season, int price, String color, int duration) {
		super(name, season, price);
		this.color = color;
		this.duration = duration;
	}

	public String toString() {
		return "COLOR = " + color + " " + "DURATION = " + duration + " " + super.toString();
	}
}
