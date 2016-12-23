package core.less10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;
import java.util.stream.Stream;

public class Main {

			
	private static final List<Person> List = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			
		List.add(new Person("Ivan", 18, Gender.MALE));
		List.add(new Person("Ira", 19, Gender.FEMALE));
		List.add(new Person("Petro", 15, Gender.MALE));
		List.add(new Person("Olya", 14, Gender.FEMALE));
		List.add(new Person("Mukola", 19, Gender.MALE));
		List.add(new Person("Tanya", 20, Gender.FEMALE));
		List.add(new Person("Nazar", 25, Gender.MALE));
		List.add(new Person("Sonya", 16, Gender.FEMALE));
		List.add(new Person("Yarena", 35, Gender.MALE));
		List.add(new Person("Lesya", 40, Gender.FEMALE));
		List.add(new Person("Timur", 11, Gender.MALE));
		List.add(new Person("Zlata", 10, Gender.FEMALE));
		List.add(new Person("Spiridon", 16, Gender.MALE));
		List.add(new Person("Oksana", 18, Gender.FEMALE));
		List.add(new Person("Vasya", 19, Gender.MALE));
		List.add(new Person("Mariya", 18, Gender.FEMALE));
		List.add(new Person("Ura", 18, Gender.MALE));
		while (true){
			System.out.println("Enter 1 to sort by name asc");
			System.out.println("Enter 2 to sort by name desc");
			System.out.println("Enter 3 to sort by name asc");
			System.out.println("Enter 4 to sort by age desc");
			switch (sc.next()) {
			case "1":
				sortByNameAsc().forEach(System.out :: println);
				break;
			case "2":
				sortByNameDesc().forEach(System.out :: println);
				break;
			case "3":
				sortByAgeAsc().forEach(System.out :: println);
				break;
			case "4":
				sortByAgeDesc().forEach(System.out :: println);
				break;
			case "5":
				sortByAllDesc().forEach(System.out :: println);
				break;
			default:
				sc.close();
				return;
			}
		}
	}
		static Stream<Person> sortByNameAsc(){
			return List.stream().sorted();
		}
		static List<Person> sortByNameDesc(){
			return List.stream().sorted((o1, o2)->o2.getName().compareTo(o1.getName())).collect(toList());
		}
		static Stream<Person> sortByAgeAsc(){
			return List.stream().sorted(comparingInt(Person::getAge));
		}
		static Stream<Person> sortByAgeDesc(){
			return List.stream().sorted(comparingInt(Person::getAge).reversed());
		}
		static List<Person> sortByAllDesc(){
		return List.stream()
		.sorted(comparing(Person::getName).reversed()
		.thenComparing(comparingInt(Person::getAge).reversed()
		.thenComparing(comparing(Person::getGender).reversed()))).collect(toList());
	}
}