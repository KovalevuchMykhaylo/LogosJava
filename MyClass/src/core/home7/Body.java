package core.home7;

import java.util.Arrays;

public class Body {
	
	private String material;
	
	private String color;

	Body(String color) {
		this.material = material;
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [material=" + material + ", color=" + color + "]";
	}

	
	

}