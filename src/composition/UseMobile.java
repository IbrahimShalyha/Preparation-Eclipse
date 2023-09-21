package composition;

public class UseMobile {
	public static void main(String[] args) {
		Sim s1 = new Sim();
		s1.setType("NANO");
		s1.setBrand("AIRTEL");

		Mobile m1 = new Mobile();
		m1.setBrand("REDMI");
		m1.setPrice(10000);
		m1.setSim(s1);

		System.out.println("BRAND = " + m1.getBrand() + "," + " PRICE = " + m1.getPrice());
		System.out.println(m1.getSim().getType() + "," + m1.getSim().getBrand());

	}
}
