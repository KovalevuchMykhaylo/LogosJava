package core.less8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Spliterator;

import core.less6.Gender;
import core.less6.Person;

import java.util.Iterator;

import javax.swing.text.GapContent;

public class Mainmy {

			
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
			System.out.println("Enter 1 to rename");
			System.out.println("Enter 2 to rind ");
			System.out.println("Enter 3 ti delete ");
			switch (sc.next()) {
			case "1":
				rename();
				break;
			case "2":
				findByLetter();
				break;
			case "3":
				deleteBeAge();
				break;
			case "4":
				find();
				break;
			default:
				sc.close();
				return;
			}
		}
	}
		static void find(){
			System.out.println("Enter gender");
			Gender gender = Gender.valueOf(sc.next().toUpperCase());
			List<Integer> res = new ArrayList<>();
			ListIterator<Person> iter = List.listIterator();
			while(iter.hasNext()){
				if(iter.next().getGender()==gender){
					res.add(iter.nextIndex()-1);
				}
			}
			System.out.println(res);
		}
		
		
		static void deleteBeAge(){
			System.out.println("Enter min age");
			int min = sc.nextInt();
			System.out.println("Enter max age");
			int max = sc.nextInt();
			Iterator<Person> iter = List.iterator();
			while (iter.hasNext()){
				Person person = iter.next();
				if(iter.next().getAge()>min&&person.getAge()<max){
					iter.remove();
				}
			}
			List.forEach(System.out :: print);
		}
		
		static void rename(){
			if(!List.isEmpty()){
				Person tmp = List.get(0);
				for (Person person : List.subList(1, List.size())){
					String tmpName = person.getName();
					person.setName(tmp.getName());
					tmp.setName(tmpName);
					tmp = person;
				}
			}
			List.forEach(System.out :: println);
		}
		static void findByLetter(){
			System.out.println("enter leter ");
			String letter = sc.next();
			for (Person person : List) {
				if(person.getName().toUpperCase().contains(letter.toUpperCase()));
				System.out.println(person);
			}
		}
}