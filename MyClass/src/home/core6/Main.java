package home.core6;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Ferrary", new Body("Red"), new SteeringWheel(15), new Wheel(17));
		System.out.println(car);
		car.big();
		System.out.println(car);
	}

}
