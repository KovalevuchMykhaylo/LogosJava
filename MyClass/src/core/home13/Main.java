package core.home13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
// private static final Zooclub zoo = new Zooclub();
 private static final Scanner sc = new Scanner(System.in);
public static void main(String[] args) throws IOException {
	 Zooclub zoo = new Zooclub();
	while(true){
		
		switch (menu()) {
		case 1:
			zoo.addMember(createMember());
			System.out.println("Member is created");
			break;
		case 2:
			zoo.addAnimalToMember(createMember(), new Animal());
			save();
			break;
		case 3:
			zoo.removeAnimalfromMember(createMember(), new Animal());
			break;
		case 4:
			zoo.removeMember(createMember());
			break;
		case 5:
			System.out.println("Enter type");
			String type = sc.nextLine();
			zoo.deleteTypeAnimal(type);
			break;
		case 6:
			zoo.toString();
		case 8:
			
			FileOutputStream fos = new FileOutputStream("Zooclub.txt");
			
			fos.write(zoo.toString().getBytes());
			break;
		case 9:
			FileInputStream fis = new FileInputStream("Zooclub.txt");
			int k;
			while((k=fis.read())!=-1){
				System.out.println((char)k);
			}
			break;
		default:
			return;
		}
	}

}
//	public void restore(String fileName){
//		File file = new File(fileName+".txt");
//		if(file.exists()){
//			try(BufferedReader br = new BufferedReader(
//				new InputStreamReader(new FileInputStream(file)))){
//				List<Person> list = new ArrayList<>();
//				while (br.ready()) {
//					String line = br.readLine();
//					if(!line.isEmpty()){
//						String[] array = line.split("\\ ");
//						Person p = new Person(array[0],
//								Integer.valueOf(array[1]),
//								Gender.valueOf(array[2]));
//						list.add(p);
//					}
//				}
//				persons = list;
//				save();
//			}catch (IOException e) {
//			}
//		}
//	}

	public static Human createMember(){
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("enter age");
			int age = sc.nextInt();
			
			Human h = new Human(name, age);
			return h;
		}
	public void save(){
		File file = new File("Zooclub.txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			oos.writeObject(zoo);
			oos.flush();
		}catch (IOException e) {
		}
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
		int choice = sc.nextInt();
		return choice;
	}
}
