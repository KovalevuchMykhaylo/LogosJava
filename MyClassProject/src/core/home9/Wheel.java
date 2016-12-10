package core.home9;

import java.util.Arrays;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + diameter;
		result = prime * result + ((tires == null) ? 0 : tires.hashCode());
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
		Wheel other = (Wheel) obj;
		if (count != other.count)
			return false;
		if (diameter != other.diameter)
			return false;
		if (tires == null) {
			if (other.tires != null)
				return false;
		} else if (!tires.equals(other.tires))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", count=" + count + ", tires="
				+ tires + "]";
	}

	
}