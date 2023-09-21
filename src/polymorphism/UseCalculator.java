package polymorphism;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		System.out.println(c1.findaddition());
		System.out.println(c1.findaddition(10));
	}
}
