package dataabstraction;

public class UseBmw {
	public static void main(String[] args) {
		Bmw b1 = new Bmw();
		System.out.println(b1.Brand("Jaguar"));
		System.out.println(b1.Price(4000000));
		System.out.println(b1.Color());
	}
}
