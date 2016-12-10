package core.home9;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (haveButtons ? 1231 : 1237);
		result = prime * result + size;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SteeringWheel other = (SteeringWheel) obj;
		if (haveButtons != other.haveButtons)
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SteeringWheel [size=" + size + ", haveButtons=" + haveButtons
				+ "]";
	}

	

}