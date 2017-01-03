package sessoln1Homework;

import java.util.Scanner;

public class Teset1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println("Парне");
		}else{
			System.out.println("Непарне");
		}
	}

}
