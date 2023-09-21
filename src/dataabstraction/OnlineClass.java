package dataabstraction;

public class OnlineClass implements Course {

	public String CourseName(String coursename) {
		return coursename;
	}

	public String StaffName(String name) {
		return name;
	}

	public int CourseFees(String coursename) {
		if (coursename.equals("Java")) {
			return 20000;
		} else if (coursename.equals("Python")) {
			return 10000;
		} else if (coursename.equals("HTML")) {
			return 15000;
		} else if (coursename.equals("CSS")) {
			return 7000;
		} else {
			return 0;
		}
	}

	public String CourseDuration(String coursename) {
		if (coursename.equals("Java")) {
			return "3 Months";
		} else if (coursename.equals("Python")) {
			return "2 Months";
		} else if (coursename.equals("HTML")) {
			return "2 weeks";
		} else if (coursename.equals("CSS")) {
			return "3 weeks";
		} else {
			return "INVALID VALUE";
		}
	}

}
