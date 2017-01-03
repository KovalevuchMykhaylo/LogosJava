package core.home15.copy;

import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MyMap<String, String> myMap = new MyMap<>();

		while (true) {
			System.out.println("Enter 1 to add somesing");
			System.out.println("Enter 2 to delete by key");
			System.out.println("Enter 3 to set value null");
			System.out.println("Enter 4 to show all keys");
			System.out.println("Enter 5 to show all values");
			System.out.println("Enter 6 to show all");
			switch (sc.next()) {
			case "1":
				System.out.println("Enter key");
				String key = sc.next();
				System.out.println("Enter value");
				String value = sc.next();
				myMap.addSome(key, value);
				break;
			case "2":
				System.out.println("Enter key");
				myMap.deleteSomeK(sc.next());
				break;
			case "3":
				System.out.println("Enter value to set value null");
				System.out.println("Enter value");
				myMap.deleteSomeV(sc.next());
				break;
			case "4":
				System.out.println("Show all keys");
				myMap.getKeys();
				break;
			case "5":
				System.out.println("Show all values");
				myMap.getValues();
				break;
			case "6":
				System.out.println("Show all");
				myMap.printSomeKV();
				break;

			default:
				sc.close();
				return;
			}
		}

	}
}
