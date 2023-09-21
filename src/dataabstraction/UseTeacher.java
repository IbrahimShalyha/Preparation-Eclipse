package dataabstraction;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		System.out.println(t1.ShowWork("TEACHER"));
		System.out.println(t1.ShowSalary(25000));
		System.out.println(t1.ShowName("AMUTHA"));
	}
}
