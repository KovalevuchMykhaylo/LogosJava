package core.home12;

import core.home12.MyException;

public class Methods {
	public static int getAreaValue(int x, int y){ 
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y; 
    } 
	
	public static int plus(int x, int y){ 
        if(x > 0 || y > 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y); 
        return x+y; 
    } 
	public static int nimus(int x, int y) throws MyException{ 
        if(x > 0 || y > 0) throw new MyException (); 
		return x+y; 
    } 
	public static int error (int x, int y) throws IllegalAccessException {
		try{
		if (x<0 || y<0)throw new IllegalArgumentException("Ups");
		else if (x==0 && y!=0)throw new ArithmeticException("My bee");
		else if (x!=0 && y==0)throw new ArithmeticException("WTF");
		else if (x==0 && y==0)throw new IllegalAccessException("No");
		}catch(IllegalArgumentException e){
		}return x + y;
			}
	public static int error1 (int x, int y) throws IllegalAccessException {
		if (x<0 || y<0)throw new IllegalArgumentException("Ups");
		else if (x==0 && y!=0)throw new ArithmeticException("My bee");
		else if (x!=0 && y==0)throw new ArithmeticException("WTF");
		else if (x==0 && y==0)throw new IllegalAccessException("No");
		return x - y;
			}
	public static int error2 (int x, int y) throws IllegalAccessException {
		if (x<0 || y<0)throw new IllegalArgumentException("Ups");
		else if (x==0 && y!=0)throw new ArithmeticException("My bee");
		else if (x!=0 && y==0)throw new ArithmeticException("WTF");
		else if (x==0 && y==0)throw new IllegalAccessException("No");
		return x / y;
			}
	public static int error3 (int x, int y) throws IllegalAccessException {
		if (x<0 || y<0)throw new IllegalArgumentException("Ups");
		else if (x==0 && y!=0)throw new ArithmeticException("My bee");
		else if (x!=0 && y==0)throw new ArithmeticException("WTF");
		else if (x==0 && y==0)throw new IllegalAccessException("No");
		return x * y;
			}
}