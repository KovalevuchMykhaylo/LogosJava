package core.home13.copy;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		Zooclub z = new Zooclub();
		ControllerZ controller = new ControllerZ();
		while (true) {
			System.out.println("1 Add member");
			System.out.println("2 Add Animal to Member");
			System.out.println("3 Remove Animal from Member");
			System.out.println("4 Remove member");
			System.out.println("5 Remove TYPE of Animal from all Member in club");
			System.out.println("6 Print Zooclub");
			System.out.println("7 ");
			System.out.println("8 print");
			System.out.println("9 to write to text file");
			System.out.println("10 to restore from text file");
			System.out.println("11 Exit");
			switch (sc.next()) {
			case "1":
				z.addMember(createMember());
				System.out.println("Member is created");
				break;
			case "2":
				z.addAnimalToMember(createMember(), createAnimal());
				break;
			case "3":
				z.removeAnimalfromMember(createMember(), createAnimal());
				break;
			case "4":
				z.removeMember(createMember());
				break;
			case "5":
				System.out.println("Enter type");
				AnimalType type = AnimalType.valueOf(sc.next().toUpperCase());
				z.deleteTypeAnimal(type);
				break;
			case "6":
				z.toString();
				break;
			case "7":
				
				break;
			case "8":
				controller.print();
				break;
			case "9":
				System.out.println("Enter file name");
				controller.write(sc.next());
				break;
			case "10":
				System.out.println("Enter file name");
				controller.restore(sc.next());
				break;
			default:
				sc.close();
				break;
			}
		}

	}

	public static Human createMember() {
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();
		Human h = new Human(name, age);
		return h;
	}

	public static Animal createAnimal() {
		System.out.println("Enter name:");
		String animalName = sc.next();
		System.out.println("Enter age");
		AnimalType type = AnimalType.valueOf(sc.next().toUpperCase());
		Animal an = new Animal(animalName, type);
		return an;
		
	}

}