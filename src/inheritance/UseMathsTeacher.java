package inheritance;

public class UseMathsTeacher {
	public static void main(String[] args) {
		MathsTeacher m1 = new MathsTeacher();
		m1.experience = 4;
		m1.qualification = "Msc Maths";
		m1.name = "RAJA";
		m1.salary = 20000;
		m1.subject = "Maths";
		m1.standard = "10th Standard";

		System.out.println(m1.experience + m1.qualification);
	}
}
