package homelesson2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter real number:");
              int n = scan.nextInt();
              System.out.print("Factorial:");
               int factorial = 1;
               if (n>=0){
                for (int i = 2; i <= n; i++)
                	factorial *= i;
                 System.out.println(factorial);}
               else{
             System.out.println("ERROR");}
               {
            	   try7(0);
               }
               {
            	   try7(0);
               }
        
    }
	static void try7 (int i) {
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
}