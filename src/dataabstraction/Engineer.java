package dataabstraction;

abstract public class Engineer implements Human {

	abstract public int ShowSalary(int salary);

	abstract public String ShowName(String name);

	public int ShowExperience(int experience) {
		return experience;
	}

}
