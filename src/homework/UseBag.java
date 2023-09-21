package homework;

public class UseBag {
public static void main(String[]args) {
	Zip z1 = new Zip("PLASTIC", 4);
	
	Bag b1 = new Bag("SAFARI",1000,6,z1);
	System.out.println(b1);
}
}
