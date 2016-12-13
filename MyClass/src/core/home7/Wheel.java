package core.home7;

import java.util.Arrays;

public class Wheel{
	
	private int diameter; 
	
	private int count;

	Wheel(int diameter, int count) {
		this.diameter = diameter;
		this.count = count;
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

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", count=" + count + "]";
	}


	
}