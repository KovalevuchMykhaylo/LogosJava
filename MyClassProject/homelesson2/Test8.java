package homelesson2;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		   
	 try8(0);     
	}
	static void try8 (int k){
	       int n = new Scanner(System.in).nextInt();
	         for(int i = 1; i <= n; i++){
	           if ((n % i) == 0){
	             System.out.print(i + " ");
	            }
	        
	        }
	}
	
}
	   


