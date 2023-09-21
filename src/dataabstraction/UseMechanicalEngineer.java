package dataabstraction;

public class UseMechanicalEngineer {
	public static void main(String[] args) {

		MechanicalEngineer m1 = new MechanicalEngineer();

		m1.sleeping();
		m1.eating();
		System.out.println(m1.ShowSalary(20000));
		System.out.println(m1.ShowName("JACK"));
		System.out.println(m1.ShowExperience(4));
	}
}
