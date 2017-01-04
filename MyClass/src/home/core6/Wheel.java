package home.core6;

public class Wheel {
	private int size;

	public Wheel(int size) {
		super();
		this.size = size;
	}
	public void big() {
		size*=2;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + "]";
	}

}
