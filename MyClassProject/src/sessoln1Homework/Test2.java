package sessoln1Homework;

import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 10;
		double d=Math.abs(c-a);
		double e=Math.abs(c-b);
		if(e>d){System.out.println(a+" ближче");
		}else if (d>e){System.out.println(b+" ближче");
		}else {System.out.println("Рівновіддалені");
		}
	}
}


