package Lesson2;

public class main {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		switch (i) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("default");
		}
		while (i < 10) {
			hello();
			System.out.println(++i);
		}

		do {
			hello();
			System.out.println(++i);
		} while (i < 10);

		for (int j1 = 0; j1 < 10; j1++) {
			System.out.println(j1);
		}
		hello();
		int icrement = icrement(1);
		System.out.println(icrement);
		System.out.println(calculate(2,3,'+'));
	}

	static void hello() {
		System.out.println("Hello");
	}

	static int icrement(int i) {
		i++;
		return i++;
		
	}

	static double two(double a, double b) {
		return a + b;
	}
	static double minus(double a, double b) {
		return a - b;
	}
	static double mrx(double a, double b) {
		return a * b;
	}
	static double mrslash(double a, double b) {
		return a / b;
	}
	static double calculate (double a, double b, char operator){
		a = 2.25;
		b = 3.23;
		switch(operator) {
		 case '+':
			 return two(a, b);
        
           case '-':
        	   return	minus(a, b);
      
        case '*':
        	return mrx(a, b);
        
        case '/':
        	return mrslash(a, b);
        		}
		return 0;
		}

	static double calculate1 (double a, double b, char operator){
	switch (operator){
	case '+':return two(a,b);
	case '-':return minus(a,b);
	case '/':return mrslash(a,b);
	case '*':return mrx(a,b);
	default:
		calculate(a, b, operator);
		return 0;
	}
	}
	
}
