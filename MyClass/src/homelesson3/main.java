package homelesson3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//{metod1();}//1-10
		//{metod1();}//10-0
		//{metod3();}//Fatrorial 32 max
		//{metod4(0, 0);};//Function +
		//{metod5(0,0);}//Function /
		//{metod6(0,0);}//Function *
		//{metod7(0,0);}//Function -
		//{metod8(0);}//Function Sqrt
		//{metod9();}//Trigel
		//{metod10();}//Hellow
		//{metod11();}//Hellow++
		//{metod12();}//Cube2d
		//{metod13(0);}//X10
		//{metod14();}//Discriminant
		//{metod15();}//Exchange Rates
		//{metod16();}//Medium spped
		//{metod17();}//Quadratic equations
		//{metod18();}//Area of a triangle
		//{metod19();}//Fibonacci numbers
		//{metod20();}//How many gigabytes
		{metod21();}//Masive
		//{metod22(0, 0);}//Chouse 4-7
		//{metod23();}//Do you realy wont to know
		//{metod24(0);}//fact
	}
	static int metod1(){
		for(int i=1; i<=10; i++)
		System.out.println(i);
		return 0;
	}
	static int metod2(){
		for(int i=10;i>=0; i--)
		System.out.println(i);
		return 0;
	}
	static void metod3() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter real number:");
        int n = scan.nextInt();
        System.out.print("Factorial:");
         int factorial = 1;
         if (n>=0){
          for (int i1 = 2; i1 <= n; i1++)
          	factorial *= i1;
           System.out.println(factorial);}
         else{
       System.out.println("ERROR");
       }
	}
	static double metod4(double a, double b){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		 a = scan.nextDouble();
		 b = scan.nextDouble();
		System.out.println(a+b);
		return a+b;
	}
	static double metod5 (double a, double b){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = scan.nextDouble();
		 b = scan.nextDouble();
		 System.out.println(a/b);
		return a/b;
			}
	static double metod6 (double a, double b){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = scan.nextDouble();
		 b = scan.nextDouble();
		 System.out.println(a*b);
		return a*b;
			}
	static double metod7 (double a, double b){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = scan.nextDouble();
		 b = scan.nextDouble();
		 System.out.println(a-b);
		return a-b;
			}
	static double metod8 (double a){
		Scanner scan = new Scanner(System.in);
		System.out.println("Square root:");
		a = scan.nextDouble();
		System.out.println(Math.sqrt(a));
		return a;
	}
	static void metod9(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = scan.nextInt();
	for(int i=1; i<=10; i++){
		for(int j=0; j<i; j++){
			System.out.print(a+" ");
		}
		System.out.println();
		
	}
	}
	static String metod10(){
		System.out.println("Hello world");
		return null;
	}
	static String metod11(){
		Scanner scan = new Scanner(System.in);
		System.out.println("How mach");
		int a = scan.nextInt();
		for(int i=1; i<=a; i++)
		System.out.println("Hello world");
		return null;
	}
	static void metod12(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = scan.nextInt();
	for(int i=1; i<=10; i++){
		for(int j=0; j<=10; j++){
			System.out.print(a+" ");
		}
		System.out.println();
		
	}
	}
	static int metod13(int a){
		System.out.println(a*10);
		return a;
	}
	static double metod14(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter b:");
		double b = scan.nextDouble();
		System.out.println("Enter a:");
		double a = scan.nextDouble();
		System.out.println("Enter c:");
		double c = scan.nextDouble();
		String d="Discriminant";
		double x12= b*b-4*a*c;
		if(x12<0)
			System.out.println("Error");
		System.out.println(d+x12);
		return 0;
	}
	static double metod15(){
		Scanner scan = new Scanner(System.in);
		System.out.println("How mach:");
		double a = scan.nextDouble();
		System.out.println("Ñourse:");
		double b = scan.nextDouble();
		System.out.println(a*b);
		return 0;
	}
	static double metod16(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Distance");
		double s = scan.nextDouble();
		System.out.println("Time");
		double t = scan.nextDouble();
		double v = s/t;
		System.out.println(v);
		return 0;
	}
	static double metod17(){
		metod14();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter b:");
		double b = scan.nextDouble();
		System.out.println("Enter a:");
		double a = scan.nextDouble();
		System.out.println("Enter c:");
		double c = scan.nextDouble();
		String x12="Discriminant";
		double d = b*b-4*c*a;
		if(d<0){
		System.out.println("ERROR");
		}else if(d>0){
		double x1=(-b-Math.sqrt(d))/(2*a);
		System.out.println("x1="+x1);
		double x2=(-b+Math.sqrt(d))/(2*a);
		System.out.println("x1="+x2);
		}else{
		double x=-b/2*a;
		System.out.println(x);}
		return 0;
	}
	static double metod18(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = scan.nextDouble();
		System.out.println("Enter b:");
		double b = scan.nextDouble();
		System.out.println("Enter ñ:");
		double c = scan.nextDouble();
		System.out.println(a+b+c);
		return 0;
	}
	static int metod19(){
		System.out.println("Enter real number:");
		int a = 1;
	     int b = 1;
	     int n;
	     int sum_fib = 0;
	     Scanner s = new Scanner(System.in);
	     n = s.nextInt();
	     for(int i = 0; i < n; i++){
	     sum_fib = a + b;
	     a = b;
	     b = sum_fib;
	     System.out.print(sum_fib + " ");
	     }
		 return sum_fib;
	}
	static int metod20(){
		System.out.println("The number of megabytes");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a/1024);
		return 0;
	}
	static int metod21(){
		System.out.println("Enter real number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[]= new int[n];
		for(int i=1; i<array.length; i++){
		System.out.println(array[n]);}
		return 0;
	}
	static double metod22(double a, double b){
		System.out.println("Enter real number 4-7");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		switch (n) {
		case 4:return metod4(0, 0); 
		case 5:return metod5(0, 0);
		case 6:return metod6(0, 0);
		case 7:return metod7(0, 0);
		default: metod22(a, b); return 0;
	}
	}
	static int metod23(){
		int i = (int)(Math.random()*101);
		System.out.println("Your going to die: "+i+"%");
		return 0;
	}
//	public static int metod24(int num1) {
//		System.out.println("Enter real number:");
//		Scanner n = new Scanner(System.in);
//		int metod24(int n): {
//		int result;
//		if(n == 1) return 1;
//		result = metod24(n-1) * n;
//		return result;
//		}	     
//	}
}