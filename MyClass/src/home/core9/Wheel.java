package home.core9;

public class Wheel {
	String type;
	int size;

	public Wheel(String type, int size) {
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Wheel [type=" + type + ", size=" + size + "]";
	}

}
