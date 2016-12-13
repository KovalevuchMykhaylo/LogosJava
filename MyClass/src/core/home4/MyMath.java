package core.home4;

public class MyMath {

	public static void main(String[] args) {
		final int a = 25;
		final int b = 100;
		final int c = 1000;
		metod(a, b);
		metod1(a, c);
		metod2(a, b, c);
	}
	static void metod(int a, int b){
			int d = a+b;
		System.out.println(d);
	}
	static void metod1(int a, int c){
		int d = c/a;
	System.out.println(d);
	}
	static void metod2(int a, int b, int c){
		int d = c+a+b;
	System.out.println(d);
	}
}