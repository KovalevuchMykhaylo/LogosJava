package core.home8;

public class Wheel{
	
	private int diameter; 
	
	private int count;
	
	private String tires;

	public Wheel(int diameter, int count, String tires) {
		super();
		this.diameter = diameter;
		this.count = count;
		this.tires = tires;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getTires() {
		return tires;
	}

	public void setTires(String tires) {
		this.tires = tires;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", count=" + count + ", tires="
				+ tires + "]";
	}

	
}