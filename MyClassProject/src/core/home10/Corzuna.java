package core.home10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Corzuna {
	ArrayList<Comodity> array = new ArrayList<>();
	
	public void addTovar(){
		System.out.println("**********Product options*************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Product name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		int price = sc.nextInt();
		System.out.println("Wight: ");
		int wigth = sc.nextInt();
		System.out.println("Lenght: ");
		int len = sc.nextInt();
		array.add(new Comodity(name, price,wigth,len));
		array.forEach(System.out::println);
		
	}
	
	public void deleteTovar(String name){
		Iterator<Comodity> iterator = array.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getName().equals(name)){
				iterator.remove();
			}
		}
		for (Comodity comodity : array) {
			System.out.println("Product "+comodity);
		}
	}
	
	public void replaceTovar(String nameOfReplace){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of new product: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		int price = sc.nextInt();
		System.out.println("Widht: ");
		int wigth = sc.nextInt();
		System.out.println("Leght: ");
		int len = sc.nextInt();
		Comodity c = new Comodity(name, price,wigth,len);
		int j =0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).getName().equals(nameOfReplace)){
				 j = i;
			}
		}
		array.set(j, c);
		for (Comodity comodity : array) {
			System.out.println(comodity);
		}
	}
	
	public void sortByName(){
		Collections.sort(array, new SortByName());
		for (Comodity comodity : array) {
			System.out.println(comodity);
		}
	}
	
	public void sortByLenght(){
		Collections.sort(array, new SortByLenght());
		for (Comodity comodity : array) {
			System.out.println(comodity);
		}
	}
	
	public void sortByPrice(){
		Collections.sort(array, new SortByPrice());
		for (Comodity comodity : array) {
			System.out.println(comodity);
		}
	}
	
	public void sortByWidth(){
		Collections.sort(array, new SortByWidth());
		for (Comodity comodity : array) {
			System.out.println(comodity);
		}
	}
}