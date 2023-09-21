package dataabstraction;

public class UseCanaraBank {
	public static void main(String[] args) {
		CanaraBank c1 = new CanaraBank();
		System.out.println(c1.getRateOfInterest());
		System.out.println(c1.getLoan(1000));
		System.out.println(c1.getLoan(1000, 2000));
	}
}
