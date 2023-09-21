package dataabstraction;

public class Dog implements DomesticAnimal {
	public void sound() {
		System.out.println("BOW-BOW");
	}

	public void eat() {
		System.out.println("BISCUITS");
	}

	public void sleeping(String a) {
		System.out.println(a);
	}

	public String name(String names) {
		return names;
	}
}
