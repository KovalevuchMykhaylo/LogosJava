package core.home13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
	Zooclub z = new Zooclub();
	while(true){
		
		switch (menu()) {
		case 1:
			z.addMember(createMember());
			System.out.println("Member is created");
			break;
		case 2:
			z.addAnimalToMember(createMember(), new Animal());
			break;
		case 3:
			z.removeAnimalfromMember(createMember(), new Animal());
			break;
		case 4:
			z.removeMember(createMember());
			break;
		case 5:
			System.out.println("Enter type");
			Scanner sc = new Scanner(System.in);
			String type = sc.nextLine();
			z.deleteTypeAnimal(type);
			break;
		case 6:
			z.toString();
		case 8:
			File file = new File("Zooclub.txt");
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			
			fos.write(z.toString().getBytes());
			break;
		case 9:
			FileInputStream fis = new FileInputStream("Zooclub.txt");
			int k;
			while((k=fis.read())!=-1){
				System.out.println((char)k);
			}
			break;
		default:
			break;
		}
	}

}


public static Human createMember(){
		System.out.println("Enter name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("enter age");
		int age = sc.nextInt();
		
		Human h = new Human(name, age);
		return h;
	}
public static int menu(){
	System.out.println("1 Add member");
	System.out.println("2 Add Animal to Member");
	System.out.println("3 Remove Animal from Member");
	System.out.println("4 Remove member");
	System.out.println("5 Remove TYPE of Animal from all Member in club");
	System.out.println("6 Print Zooclub");
	System.out.println("7 Exit");
	System.out.println("8 Write to file");
	System.out.println("Your choice");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	return choice;
	}
}
