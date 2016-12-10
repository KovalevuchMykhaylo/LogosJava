package core.home52;

public class SteeringWheel {
	
	private int size;

	public SteeringWheel(int size) {
		this.size = size;
	}
	public void changeSize(){
		size+=1;
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