package core.home52;

public class Main {

	public static void main(String[] args) {
//		Body body = new Body("Alu", "Color");
//		SteeringWheel steeringWheel = new SteeringWheel(17);
//		Wheel wheel = new Wheel(17, 4);
//		Car car = new Car("Ferrari", body, steeringWheel, wheel);
//		System.out.println(car);
//		car.changeSize();
//		System.out.println(car);
//		car.bigWheel();
//		System.out.println(car);
//		car.getBody().setMaterial("Metall");
//		System.out.println(car);
		
		Car car = new Car("Ferrari", new Body("Alu", "Color"), new SteeringWheel(17), new Wheel(17, 4));
		System.out.println(car);
		car.changeSize();
		System.out.println(car);
		car.bigWheel();
		System.out.println(car);
		car.getBody().setMaterial("Metall");
		System.out.println(car);
	}

}