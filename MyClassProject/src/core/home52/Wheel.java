package core.home52;

public class Wheel{
	
	private double diameter; 
	
	private int count;

	public Wheel(double diameter, int count) {
		this.diameter = diameter;
		this.count = count;
	}
	public void bigWheel(){
		diameter+=1;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Body [diameter=" + diameter + ", count=" + count + "]";
	}
}