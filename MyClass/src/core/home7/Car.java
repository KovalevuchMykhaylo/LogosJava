package core.home7;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	private String vendor;
	
	private Body body;
	
	private SteeringWheel steeringWheel;
	
	private Wheel wheel;

	Car(String vendor, Body body, SteeringWheel steeringWheel,
			Wheel wheel) {
		this.vendor = vendor;
		this.body = body;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
//		Car car1 = new Car(vendor, body, steeringWheel, wheel);
//		Car car2 = new Car(vendor, body, steeringWheel, wheel);
//		Car car3 = new Car(vendor, body, steeringWheel, wheel);
//		Car car4 = new Car(vendor, body, steeringWheel, wheel);
//		Car car5 = new Car(vendor, body, steeringWheel, wheel);
//		Car car6 = new Car(vendor, body, steeringWheel, wheel);
//		Car car7 = new Car(vendor, body, steeringWheel, wheel);
//		Car car8 = new Car(vendor, body, steeringWheel, wheel);
//		Car car9 = new Car(vendor, body, steeringWheel, wheel);
//		Car car10 = new Car(vendor, body, steeringWheel, wheel);
//		Car car11 = new Car(vendor, body, steeringWheel, wheel);
//		Car car12 = new Car(vendor, body, steeringWheel, wheel);
//		Car car13 = new Car(vendor, body, steeringWheel, wheel);
//		Car car14 = new Car(vendor, body, steeringWheel, wheel);
//		Car car15 = new Car(vendor, body, steeringWheel, wheel);
//		List<Car> list = new ArrayList<>();
//		list.add(car1);
//		list.add(car2);
//		list.add(car3);
//		list.add(car4);
//		list.add(car5);
//		list.add(car6);
//		list.add(car7);
//		list.add(car8);
//		list.add(car9);
//		list.add(car10);
//		list.add(car11);
//		list.add(car12);
//		list.add(car13);
//		list.add(car14);
//		list.add(car15);
//		System.out.println(list);
//		
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