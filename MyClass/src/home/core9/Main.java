package home.core9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	private static final ArrayList<Car> List = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List.add(new Car("Ferrary", new Body("Dead", "Black"),
				new SteeringWheel(14, true), new Wheel("Winter", 19)));
		List.add(new Car("BMW", new Body("Alive", "Red"), new SteeringWheel(15,
				false), new Wheel("Summer", 17)));
		while (true) {
			System.out.println("Enter 1 to find body type: ");
			System.out.println("Enter 2 to delete car by color: ");
			switch (sc.next()) {
			case "1":
				one();
				break;
			case "2":
				two();
				break;

			default:
				sc.close();
				return;
			}
		}
	}

	static void one() {
		System.out.println("Enter body type: ");
		String typ = sc.next();
		Iterator<Car> iter = List.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getBody().getType().equals(typ))
				System.out.println(car);

		}
	}

	static void two() {
		System.out.println("Enter color: ");
		String col = sc.next();
		Iterator<Car> iter = List.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getBody().getColor().equals(col)) {
				iter.remove();
			}
		}
		List.forEach(System.out::println);
	}

}
