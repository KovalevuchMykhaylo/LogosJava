package core.home8;

import java.util.Arrays;

public class Body {
	
	private String material;
	
	private String color;
	
	private String type;

	public Body( String color, String material, String type) {
		super();
		this.material = material;
		this.color = color;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Body [material=" + material + ", color=" + color + ", type="
				+ type + "]";
	}

	
}