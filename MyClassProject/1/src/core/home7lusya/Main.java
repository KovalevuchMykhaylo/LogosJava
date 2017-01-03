package core.less7h1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import core.less5h.Body;
import core.less5h.Car;
import core.less5h.SteeringWheel;
import core.less5h.Wheel;

public class Main {

	private static final List<Car> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		list.add(new Car("Ferarri", new Body("red", "alum"), new Wheel(4, 21), new SteeringWheel(5, "black", true)));
		list.add(new Car("Mclaren", new Body("orange", "alum"), new Wheel(4, 20), new SteeringWheel(4, "gray", true)));
		list.add(new Car("BMW", new Body("yellow", "steel"), new Wheel(4, 18), new SteeringWheel(5, "black", false)));
		list.add(new Car("Koenisegg", new Body("white", "carbon"), new Wheel(4, 22),
				new SteeringWheel(3, "white", true)));
		list.add(new Car("Pagani", new Body("grey", "carbon"), new Wheel(4, 21), new SteeringWheel(6, "gray", true)));
		list.add(new Car("Porshe", new Body("silver", "alum"), new Wheel(4, 19), new SteeringWheel(3, "black", false)));
		list.add(new Car("Lamborgini", new Body("purple", "alum"), new Wheel(4, 20),
				new SteeringWheel(4, "white", true)));
		list.add(
				new Car("Mersedes", new Body("black", "alum"), new Wheel(4, 18), new SteeringWheel(3, "brown", false)));
		list.add(new Car("Nissan", new Body("blue", "steel"), new Wheel(4, 17), new SteeringWheel(2, "black", true)));
		list.add(new Car("Mitsubishi", new Body("green", "steel"), new Wheel(4, 16),
				new SteeringWheel(5, "black", false)));

		while (true) {
			System.out.println("Enter 1 to find car by wheel diameter");
			System.out.println("Enter 2 to find car by wheel diameter and body color");
			System.out.println("Enter 3 to switch steering wheel in red cars");
			System.out.println("Enter 4 to increase wheel diameter if SWheel has a buttons");
			System.out.println("Enter 5 to change cars with smaller wheel diameter");
			switch (sc.next()) {
			case "1":
				task1();
				break;
			case "2":
				task2();
				break;
			case "3":
				task3();
				break;
			case "4":
				task4();
				break;
			case "5":
				task5();
				break;
			default:
				sc.close();
				return;
			}
		}
	}

	static void task1() {
		System.out.println("Enter wheel diameter: ");
		int diam = sc.nextInt();
		for (Car car : list) {
			if (car.getWheel().getDiameter() == diam) {
				System.out.println(car);
			}
		}
	}

	static void task2() {
		System.out.println("Enter wheel diameter: ");
		int diam = sc.nextInt();
		System.out.println("Enter body color");
		String color = sc.next();
		for (Car car : list) {
			if (car.getWheel().getDiameter() == diam && car.getBody().getColor() == color) {
				System.out.println(car);
			}
		}
	}

	static void task3() {
		for (Car car : list) {
			if (car.getBody().getColor().contains("red")) {
				car.getSteeringWheel().setSize(1);
				System.out.println(car.getBrand() + " have red color, Steering wheel size switched!");
				System.out.println("See ya!");
			}
		}
	}

	static void task4() {
		for (Car car : list) {
			if (car.getSteeringWheel().isButtons() == true) {
				car.getWheel().setDiameter(car.getWheel().getDiameter() * 2);
				System.out.println(car.getBrand() + " steering wheel have buttos, diameter wheel twiced!");
			}
		}
	}

	static void task5() {
		Car carr = new Car("Noname", new Body("transparent", "glass"), new Wheel(1, 10),
				new SteeringWheel(0, "transparent", false));
		System.out.println("Enter wheel diameter: ");
		int diam = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWheel().getDiameter() < diam) {
				System.out.println(i);
				System.out.println(list.get(i).getBrand() + " with " + list.get(i).getWheel().getDiameter()
						+ " of wheel diameter, will be changed to other car.");
				list.remove(i);
				list.add(carr);
			}
		}
	}
}