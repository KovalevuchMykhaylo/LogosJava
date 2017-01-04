package home.core8;

import home.core6.Body;
import home.core6.Car;
import home.core6.SteeringWheel;
import home.core6.Wheel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import org.omg.CORBA.FREE_MEM;

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	private static final List<Car> List = new ArrayList<>();

	public static void main(String[] args) {
		List.add(new Car("Ferrary", new Body("Red"), new SteeringWheel(15),
				new Wheel(17)));
		List.add(new Car("Lada", new Body("Black"), new SteeringWheel(14),
				new Wheel(16)));
		List.add(new Car("Mazda", new Body("Green"), new SteeringWheel(18),
				new Wheel(18)));
		List.add(new Car("BMW", new Body("Orange"), new SteeringWheel(13),
				new Wheel(15)));
		List.add(new Car("Mersedes", new Body("Blue"), new SteeringWheel(19),
				new Wheel(19)));
		while (true) {
			System.out.println("Enter 1 to see car whith wheel size: ");
			System.out.println("Enter 2 to find all car with body color and wheel size: ");
			System.out.println("Enter 3 to change steering wheel: ");
			switch (sc.next()) {
			case "1":
				one();
				break;
			case "2":
				two();
				break;
			case "3":
				three();
				break;

			default:

				break;
			}
			sc.close();

			return;
		}
	}

	private static void one() {
		System.out.println("Enter size:");
		int whellSize = sc.nextInt();
		for (Car car : List) {
			if (car.getWheel().getSize()== whellSize)
				System.out.println(car);
		}
	}
	private static void two() {
		System.out.println("Enter coloe:");
		String col = sc.next();
		System.out.println("Enter size:");
		int whellSize = sc.nextInt();
		for (Car car : List) {
			if((car.getBody().getColor().equals(col)) && (car.getWheel().getSize()==whellSize)){
				System.out.println(car);
			}
		}
		System.out.println();
	}
	private static void three() {
		System.out.println("Enter color:");
		String col = sc.next();
		for (Car car : List) {
			if(car.getBody().getColor().equals(col)){
				car.getSteeringWheel().setSize(11);
				System.out.println(car);
			}
			
		}
	}
}
