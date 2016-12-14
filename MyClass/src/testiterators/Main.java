package testiterators;

import java.util.*;
import static testiterators.Gender.*;

public class Main {
	
	public static final List <Person> list = new ArrayList<>();
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Person per1 = new Person("Kolya", "Kiev", MALE, 25, 175, 75);
		Person per2 = new Person("Vasya", "Kiev", MALE, 20, 170, 70);
		Person per3 = new Person("Mukola", "Kiev", MALE, 30, 180, 80);
		Person per4 = new Person("Anya", "Krakov", FEMALE, 20, 165, 65);
		Person per5 = new Person("Tanya", "Krakov", FEMALE, 28, 178, 78);
		Person per6 = new Person("Milen", "Krakov", FEMALE, 29, 179, 79);
		
		list.add(per1);
		list.add(per2);
		list.add(per3);
		list.add(per4);
		list.add(per5);
		list.add(per6);
	
		list.forEach(System.out :: println);
		System.out.println("Enter 1 to kill by gender!!!");
		switch (sc.nextInt()) {
		case 1:
			kill();
			break;

		default:
			break;
		}
	}
	
	 static void kill(){
		 if(!list.isEmpty()){
		 System.out.println("Choose: ");
		 String Choose = sc.next();
		 Iterator<Person> iter = list.iterator();
			while (iter.hasNext()) {
				Person person = iter.next();
				if(person.getGender().equals(Choose)){
					iter.remove();
				}
			}
			list.forEach(System.out::println);
		}
	 }
}