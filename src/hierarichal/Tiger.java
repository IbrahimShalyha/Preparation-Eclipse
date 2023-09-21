package hierarichal;

public class Tiger extends Animal {
	String color;
	boolean isAnimal;

	public Tiger(String name, char gender, String color, boolean isAnimal) {
		super(name, gender);
		this.color = color;
		this.isAnimal = isAnimal;
	}

	public String toString() {
		return super.toString() + " " + "COLOR = " + color + " " + "IS ANIMAL = " + isAnimal;
	}
}
