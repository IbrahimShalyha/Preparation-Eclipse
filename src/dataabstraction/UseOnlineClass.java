package dataabstraction;

public class UseOnlineClass {
	public static void main(String[] args) {
		String coursename = "HTML";
		int fees = 20000;
		String name = "BALU";
		String courseduration = "3 Months";
		OnlineClass o1 = new OnlineClass();
		System.out.println(o1.CourseName(coursename));
		System.out.println(o1.CourseFees(coursename));
		System.out.println(o1.CourseDuration(coursename));
		System.out.println(o1.StaffName(name));
	}
}
