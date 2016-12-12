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
				System.out.println("������ ����� ������:");
				String name = sc.nextLine();
				c.deleteTovar(name);
				break;
			case 3:
				System.out.println("������ ����� ������ ���� ������ �������");
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
			System.out.println("������ ������ ��������: ");
			int i = sc.nextInt();
			c.get(i);
			break;
			case 9:
				int s = c.sumOfCorzuna();
				System.out.println("�� ������� ������ �� " + s +" ���");
				System.out.println("� � ����� ������ " + v.sumOfCorzuna());
				break;
				
			default:
				return;

			}
		}
	}
	
	public static int menu(){
		System.out.println("------------Shop--------------");
		System.out.println("1 ������ �����");
		System.out.println("2 �������� �����");
		System.out.println("3 ������� �����");
		System.out.println("4 ��������� �� ������");
		System.out.println("5 ��������� �� ��������");
		System.out.println("6 ��������� �� �����");
		System.out.println("7 ��������� �� �������");
		System.out.println("8 ������� �-��� �������");
		System.out.println("9 ��������� ���");
		System.out.println("������ ��� ���� - ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		return choice;
	}
}
