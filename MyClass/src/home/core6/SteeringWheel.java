package home.core6;

public class SteeringWheel {
	private int size;

	public SteeringWheel(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "SteeringWheel [size=" + size + "]";
	}

}
