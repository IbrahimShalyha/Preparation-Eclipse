package dataabstraction;

public class MechanicalEngineer extends Engineer {

	public void sleeping() {
		System.out.println("IN BED");
	}

	public void eating() {
		System.out.println("JACK FRUIT");
	}

	public int ShowSalary(int salary) {
		return salary;
	}

	public String ShowName(String name) {
		return name;
	}

	public int ShowExperience(int experience) {
		return experience;
	}

}
