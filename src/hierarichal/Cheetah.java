package hierarichal;

public class Cheetah extends Animal {
	String color2;
	boolean isAnimal2;

	public Cheetah(String name, char gender, String color2, boolean isAnimal2) {
		super(name, gender);
		this.color2 = color2;
		this.isAnimal2 = isAnimal2;
	}

	public String toString() {
		return super.toString() + " " + "COLOR 2 = " + color2 + " " + "IS ANIMAL 2 = " + isAnimal2;
	}
}
