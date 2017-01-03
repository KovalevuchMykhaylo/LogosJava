package core.home8;

public class SteeringWheel {
	
	private int size;
	private boolean haveButtons;
	public SteeringWheel(int size, boolean haveButtons) {
		super();
		this.size = size;
		this.haveButtons = haveButtons;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isHaveButtons() {
		return haveButtons;
	}
	public void setHaveButtons(boolean haveButtons) {
		this.haveButtons = haveButtons;
	}
	@Override
	public String toString() {
		return "SteeringWheel [size=" + size + ", haveButtons=" + haveButtons
				+ "]";
	}

	

}