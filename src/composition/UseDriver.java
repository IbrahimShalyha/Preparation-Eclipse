package composition;

public class UseDriver {
	public static void main(String[] args) {
		Driver d1 = new Driver();
		d1.name = "RAJA";
		d1.age = 28;
		d1.experience = 4;

		Bus b1 = new Bus();
		b1.seats = 50;
		b1.colour = "RED";
		b1.noOfWheels = 6;
		b1.no = 13;
		
		Driver d2 = new Driver();
		d2.name = "AMAR";
		d2.age = 29;
		d2.experience = 5;
		
		Bus b2 = new Bus();
		b2.seats = 55;
		b2.colour = "YELLOW";
		b2.noOfWheels = 7;
		b2.no = 15;
		b2.driver = d2;
		
		System.out.println("SEATS = "+b2.seats+","+" "+" COLOUR = "+b2.colour+","+" NOOFWHEELS = "+b2.noOfWheels+","+" NO = "+b2.no);
	}
}
