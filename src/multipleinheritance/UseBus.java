package multipleinheritance;

public class UseBus {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		System.out.println(b1.Brand("VOLVO"));
		System.out.println(b1.Revenue(300000));
		System.out.println(b1.OwnerName("BALU"));
		System.out.println(b1.noOfVehicles(10));
	}
}
