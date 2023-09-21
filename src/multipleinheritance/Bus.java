package multipleinheritance;

public class Bus implements Vehicle, Transport {

	public String Brand(String brand) {
		return brand;
	}

	public int Revenue(int revenue) {
		return revenue;
	}

	public String OwnerName(String name) {
		return name;
	}

	public int noOfVehicles(int no) {
		return no;
	}
}
