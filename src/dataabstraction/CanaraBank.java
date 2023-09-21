package dataabstraction;

public class CanaraBank implements ReserveBank {

	public int getRateOfInterest() {
		return 10;
	}

	public int getLoan(int property) {
		return 1000;
	}

	public int getLoan(int property, int Salary) {
		return 2000;
	}
}
