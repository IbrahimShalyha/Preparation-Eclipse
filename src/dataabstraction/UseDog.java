package dataabstraction;

public class UseDog {
	public static void main(String[] args) {
		String a = "MATRESS";
		Dog d1 = new Dog();
		d1.sound();
		d1.eat();
		d1.sleeping(a);
		System.out.println(d1.name("PUPPY"));
	}
}
