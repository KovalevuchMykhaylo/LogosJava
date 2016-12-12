package core.home10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Corzuna {
	ArrayList<Comodity> array = new ArrayList<>();
	private int sum;
	
	public void addTovar(){
		System.out.println("**********Параметри товару*************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Товар: ");
		String name = sc.nextLine();
		System.out.println("Ціна: ");
		int price = sc.nextInt();
		System.out.println("Ширина: ");
		int wigth = sc.nextInt();
		System.out.println("Довжина: ");
		int len = sc.nextInt();
		array.add(new Comodity(name, price,wigth,len));
		System.out.println(array);
	}
	
	public void deleteTovar(String name){
		Iterator<Comodity> iterator = array.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getName().equals(name)){
				iterator.remove();
			}
		}
		for (Comodity comodity : array) {
			System.out.println("Товар "+comodity);
		}
	}
	
	public void replaceTovar(String nameOfReplace){
		Scanner sc = new Scanner(System.in);
		System.out.println("введіть назву нового товару: ");
		String name = sc.nextLine();
		System.out.println("Ціна: ");
		int price = sc.nextInt();
		System.out.println("Ширина: ");
		int wigth = sc.nextInt();
		System.out.println("Довжина: ");
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
	public void get(int i){
		for (int j = 0; j < array.size(); j++) {
			if(j==i){
				System.out.println(array.get(j).toString());
			}
		}
	}
	
	public int sumOfCorzuna(){
		for (Comodity comodity : array) {
			sum = sum + comodity.getPrice();
		}
		return sum;
	}
}