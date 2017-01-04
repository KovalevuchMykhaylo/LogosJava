package home.core9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final ArrayList<Car> List = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List.add(new Car("Ferrary", new Body("Dead", "Black"),
				new SteeringWheel(14, true), new Wheel("Winter", 19)));
		List.add(new Car("BMW", new Body("Alive", "Red"), new SteeringWheel(15,
				false), new Wheel("Summer", 17)));
	}

}
