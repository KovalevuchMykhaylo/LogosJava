package home.core9;

public class Car {
	String vendor;
	Body body;
	SteeringWheel steeringWheel;
	Wheel wheel;

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
	public String toString() {
		return "Car [vendor=" + vendor + ", body=" + body + ", steeringWheel="
				+ steeringWheel + ", wheel=" + wheel + "]";
	}

}
