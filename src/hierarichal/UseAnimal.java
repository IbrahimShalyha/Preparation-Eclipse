package hierarichal;

public class UseAnimal {
	public static void main(String[] args) {
		Animal a1 = new Animal("ELEPHANT", 'M');

		Tiger t1 = new Tiger("ELEPHANT", 'M', "ORANGE", true);

		Lion l1 = new Lion("ELEPHANT", 'M', "YELLOW", true);

		Cheetah c1 = new Cheetah("ELEPHANT", 'M', "WHITE", true);

		System.out.println(a1 + " " + '\n' + t1 + '\n' + l1 + '\n' + c1);

	}
}
