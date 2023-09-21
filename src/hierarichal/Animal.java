package hierarichal;

public class Animal {
	String name;
	char gender;

	public Animal(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public String toString() {
		return "NAME = " + name + " " + "GENDER = " + gender;
	}
}
