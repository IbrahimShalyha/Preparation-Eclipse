package homework;

public class Zip {
	private String type;
	private int size;

	public Zip(String type, int size) {
		this.type = type;
		this.size = size;
	}

	public String toString() {
		return type + " " + size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}
