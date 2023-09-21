package constructor;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", 63000, 8);
		System.out.println(l1.getBrand());

		l1.setBrand("Lenovo");
		System.out.println(l1.getBrand());

		l1.setPrice(45000);
		System.out.println(l1.getPrice());
	}
}
