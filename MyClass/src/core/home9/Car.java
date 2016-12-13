package core.home9;


public class Car {
	
	private String vendor;
	
	private Body body;
			
	private SteeringWheel steeringWheel;
	
	private Wheel wheel;

	public Car(String vendor, Body body, SteeringWheel steeringWheel,
			Wheel wheel) {
		super();
		this.vendor = vendor;
		this.body = body;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result
				+ ((steeringWheel == null) ? 0 : steeringWheel.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (steeringWheel == null) {
			if (other.steeringWheel != null)
				return false;
		} else if (!steeringWheel.equals(other.steeringWheel))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [vendor=" + vendor + ", body=" + body + ", steeringWheel="
				+ steeringWheel + ", wheel=" + wheel + "]";
	}

	
}