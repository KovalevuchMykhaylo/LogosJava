package core.home10.copy;

import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;


public class Shop {
	
	private static final Scanner sc = new Scanner(System.in);
	ArrayList<Comodity> List = new ArrayList<>();

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
		List.add(new Comodity(name, price,wigth,len));
		List.forEach(System.out::println);
		
	}
	
	public void deleteTovar(String name){
		Iterator<Comodity> iterator = List.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getName().equals(name)){
				iterator.remove();
			}
		}
		for (Comodity comodity : List) {
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
		for (int i = 0; i < List.size(); i++) {
			if(List.get(i).getName().equals(nameOfReplace)){
				 j = i;
			}
		}
		List.set(j, c);
		for (Comodity comodity : List) {
			System.out.println(comodity);
		}
	}
	
	public Stream<Comodity>sortByName(){
		return List.stream().sorted();
	}
	
	public Stream<Comodity>sortByLenght(){
		return List.stream().sorted(comparingInt(Comodity::getLenght));
	}
	
	public Stream<Comodity>sortByPrice(){
		return List.stream().sorted(comparingInt(Comodity::getPrice));
	}
	
	public Stream<Comodity>sortByWidth(){
		return List.stream().sorted(comparingInt(Comodity::getWidth));
		}
	}


