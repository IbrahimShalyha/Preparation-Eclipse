package hierarichal;

public class Lion extends Animal {
	String color1;
	boolean isAnimal1;

	public Lion(String name, char gender, String color1, boolean isAnima11) {
		super(name, gender);
		this.color1 = color1;
		this.isAnimal1 = isAnimal1;
	}

	public String toString() {
		return super.toString() + " " + "COLOR 1 = " + color1 + " " + "IS ANIMAL 1 =" + isAnimal1;
	}
}
