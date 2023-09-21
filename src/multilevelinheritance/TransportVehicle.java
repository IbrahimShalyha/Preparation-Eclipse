package multilevelinheritance;

public class TransportVehicle {
	String shipname;
	String color;
	int passengerCapacity;

	public TransportVehicle(String shipname, String color, int passengerCapacity) {
		this.shipname = shipname;
		this.color = color;
		this.passengerCapacity = passengerCapacity;
	}

	public String toString() {
		return "SHIPNAME = " + shipname + " " + "COLOR = " + color + " " + "PASSENGER CAPACITY = " + passengerCapacity;
	}
}
