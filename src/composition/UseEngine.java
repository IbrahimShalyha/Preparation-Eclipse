package composition;

public class UseEngine {
	public static void main(String[] args) {
		Engine e1 = new Engine();
		e1.cc = 200;
		e1.type = "FORD";
		e1.piston = 4;

		Car c1 = new Car();
		c1.brand = "BMW";
		c1.price = 4500000;
		c1.colour = "BLUE";
		c1.engine = e1;

		System.out.println(
				"BRAND = " + c1.brand + "," + " PRICE = " + c1.price + "," + " COLOUR = " + c1.colour + "," + " NAME = "
						+ c1.engine.cc + "," + " TYPE = " + c1.engine.type + "," + " PISTON = " + c1.engine.piston);
	}
}
