package mortalcombat;

import java.util.Scanner;

import mortalcombat.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Guess who wins: ");
		System.out.println("1 Sonya wins");
		System.out.println("2 Cyrax wins");
		Scanner sc = new Scanner(System.in);
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

}
