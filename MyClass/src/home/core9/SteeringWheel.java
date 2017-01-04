package home.core9;

public class SteeringWheel {
	int size;
	boolean buttons;
	public SteeringWheel(int size, boolean buttons) {
		this.size = size;
		this.buttons = buttons;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isButtons() {
		return buttons;
	}
	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}
	@Override
	public String toString() {
		return "SteeringWheel [size=" + size + ", buttons=" + buttons + "]";
	}
	

}
