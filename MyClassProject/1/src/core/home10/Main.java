package core.home10;

import java.util.Scanner;

public class Main {
	
	private static final Scanner sc = new Scanner(System.in);
	private static final Corzuna c = new Corzuna();
	
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
				c.addTovar();
				break;
			case "2":
				System.out.println("Enter the name of product:");
				String name = sc.next();
				c.deleteTovar(name);
				break;
			case "3":
				System.out.println("Enter name od product to chenge");
				String nameOfReplace = sc.nextLine();
				c.replaceTovar(nameOfReplace);
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
					c.sortByName();
					break;
				case "2":
					c.sortByLenght();
					break;
				case "3":
					c.sortByPrice();
					break;
				case "4":
					c.sortByWidth();
					break;
				}
			default:
				return;
			}
		}
	}
}