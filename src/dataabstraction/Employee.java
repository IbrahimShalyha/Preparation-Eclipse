package dataabstraction;

abstract public class Employee {
	String work;
	int salary;
	String name;

	abstract public String ShowWork(String work);

	abstract public int ShowSalary(int salary);

	abstract public String ShowName(String name);

	public int ShowAge(int age) {
		return age;
	}

}
