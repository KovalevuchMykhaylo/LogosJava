package core.home10.copy;

import java.util.Scanner;

public class Main {
	
	private static final Scanner sc = new Scanner(System.in);
	private static final Shop s = new Shop();
	
	public static void main(String[] args) {
				
		while(true){
			System.out.println("------------Shop--------------");
			System.out.println("1 Add product");
			System.out.println("2 Delete producr");
			System.out.println("3 Chenge product");
			System.out.println("4 Sort by ");
			System.out.println("Choose your destany - ");
			switch (sc.next()) {
			case "1":
				s.addTovar();
				break;
			case "2":
				System.out.println("Enter the name of product:");
				String name = sc.next();
				s.deleteTovar(name);
				break;
			case "3":
				System.out.println("Enter name od product to chenge");
				String nameOfReplace = sc.next();
				s.replaceTovar(nameOfReplace);
				break;
			case "4":
				System.out.println("------------Shop--------------");
				System.out.println("1 Sort by name");
				System.out.println("2 Sort by leught");
				System.out.println("3 Sort by price");
				System.out.println("4 Sort by wight");
				System.out.println("Choose your destany - ");
				switch (sc.next()) {
				case "1":
					s.sortByName().forEach(System.out :: println);
					break;
				case "2":
					s.sortByLenght().forEach(System.out::println);
					break;
				case "3":
					s.sortByPrice().forEach(System.out::println);
					break;
				case "4":
					s.sortByWidth().forEach(System.out::println);
					break;
				}
			default:
				return;
			}
		}
	}
}