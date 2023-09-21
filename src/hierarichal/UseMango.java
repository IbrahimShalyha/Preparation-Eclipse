package hierarichal;

public class UseMango {
	public static void main(String[] args) {
		Mango m1 = new Mango();
		m1.color = "YELLOW";
		m1.name = "JACKFRUIT";

		Orange o1 = new Orange();
		o1.price = 90;
		o1.taste = "SWEET";

		Apple a1 = new Apple();
		a1.shape = "ROUND";
		a1.isFruit = true;

		Mango f1 = new Mango();
		f1.isSeasonalFruit = true;
		f1.growthTime = 3;

		System.out.println(m1.color);
	}
}
