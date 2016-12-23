package core.home52;

public class Body {
	
	private String material;
	
	private String color;

	public Body(String material, String color) {
		this.material = material;
		this.color = color;
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