package sessoln1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		byte by=1;
		char ch='f';
		long lo=3000000000L;
		int i=1;
		double e=1.00;
		short f=1;
		float g=3.4F;
		boolean k=false;
		
		if(i>0){
			System.out.println("True");
		}else if(!k){
			System.out.println("False");			
		}else{
			System.out.println("Second else");
		}
		double a = 2;
		double b = 6;
		double c = 4;
				
		double d = b*b-4*c*a;
		System.out.println(d);
		if(d<0){
			System.out.println("Розвязку не має");
		}else if(d>0){
			double x1=(-b-Math.sqrt(d))/(2*a);
			System.out.println("x1="+x1);
			double x2=(-b+Math.sqrt(d))/(2*a);
			System.out.println("x1="+x2);
		}else{
			double x=-b/2*a;
			System.out.println(x);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int res = sc.nextInt();
		System.out.println(res);
	}
}
 