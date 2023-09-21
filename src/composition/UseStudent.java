package composition;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("RAJA");
		s1.setMarks(98);
		s1.setID(3);

		System.out.println("NAME = " + s1.getName() + "," + " MARKS = " + s1.getMarks() + "," + " ID = " + s1.getID());

	}
}
