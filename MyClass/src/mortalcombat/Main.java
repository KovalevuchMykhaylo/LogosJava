package mortalcombat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import mortalcombat.Fighters;

public class Main {
	
	private static final Scanner sc = new Scanner(System.in);
	private static final ArrayList<Fighters>List = new ArrayList<>();

	public static void main(String[] args) {
		List.add(new Fighters("Kitana"));
		List.add(new Fighters("Millena"));
		List.add(new Fighters("Sonya"));
		List.add(new Fighters("Jade"));
		List.add(new Fighters("Cyrax"));
		List.add(new Fighters("Sector"));
		List.add(new Fighters("Rain"));
		List.add(new Fighters("Raiden"));
		List.add(new Fighters("Sheva"));
		List.add(new Fighters("Scarlet"));
		List.add(new Fighters("Kabal"));
		List.add(new Fighters("Sindel"));
		
//		fight1();
		sortByName().forEach(System.out::println);
	}
	
	public static void fight1(){
	System.out.println("Guess who wins: ");
	System.out.println("1 Sonya wins");
	System.out.println("2 Cyrax wins");
	sc.nextInt();
	System.out.println("FIGHT");
	int kick = (int)(Math.random()*11);
	Cyrax cyrax = new Cyrax("Cyrax", 100, kick);
	int kick1 = (int)(Math.random()*11);
	Sonya sonya = new Sonya("Sonya", 100, kick1);
	if(kick>kick1){
		System.out.println(cyrax + "WINS");
	}else{
		System.out.println(sonya + "WINS");
	}
	}
		static Stream<Fighters> sortByName(){
			return List.stream().sorted();
		}
		
	}

	
