package multilevelinheritance;

public class UseSuperCar {
	public static void main(String[] args) {
		SuperCar s1 = new SuperCar();
		s1.noOfcar = 5;
		s1.noOfModels = 10;
		s1.brand = "BMW";
		s1.color = "WHITE";
		s1.price = 500000;
		s1.speed = 1000;
		s1.model = "X6";

		System.out.println(s1.noOfcar + "," + s1.noOfModels + "," + s1.brand + "," + s1.color + "," + s1.price + ","
				+ s1.speed + "," + s1.model);
	}
}
