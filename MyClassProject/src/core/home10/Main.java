package core.home10;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Corzuna c = new Corzuna();
		Corzuna v = new Corzuna();
		
		
		while(true){
			switch (menu()) {
			case 1:
				c.addTovar();
				v.addTovar();
				
				break;
			case 2:
				System.out.println("Введіть назву товару:");
				String name = sc.nextLine();
				c.deleteTovar(name);
				break;
			case 3:
				System.out.println("Введіть назву товару який хочете замінити");
				String nameOfReplace = sc.nextLine();
				c.replaceTovar(nameOfReplace);
				break;
			case 4:
				c.sortByName();
				break;
			case 5:
				c.sortByLenght();
				break;
			case 6:
				c.sortByPrice();
				break;
			case 7:
				c.sortByWidth();
				break;
			case 8:
			System.out.println("Введіть індекс елемента: ");
			int i = sc.nextInt();
			c.get(i);
			break;
			case 9:
				int s = c.sumOfCorzuna();
				System.out.println("Ви набрали товару на " + s +" грн");
				System.out.println("в в другій корзині " + v.sumOfCorzuna());
				break;
				
			default:
				return;

			}
		}
	}
	
	public static int menu(){
		System.out.println("------------Shop--------------");
		System.out.println("1 Додати товар");
		System.out.println("2 Видалити товар");
		System.out.println("3 Замінити товар");
		System.out.println("4 Сортувати за назвою");
		System.out.println("5 Сортувати за довжиною");
		System.out.println("6 Сортувати за ціною");
		System.out.println("7 Сортувати за шириною");
		System.out.println("8 Вивести І-тий елемент");
		System.out.println("9 Друкувати чек");
		System.out.println("Зробіть свій вибір - ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		return choice;
	}
}
