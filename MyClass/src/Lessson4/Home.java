package Lessson4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3(0, 9);
		//test4(1, 10);
		//test5(0, 5);
		//test6(10, 99);
		//test7();
		//test8(-15, 15);
		test9(1, 9);
		//test10(-1, 1);
		//test81();
		//test91();
		//test101();
		}
	
		 
		public static int test1() {
			int[] array = new int[10];	        
	        for (int i = 0, j = 2; i < array.length; i++, j+=2) {
	        	array[i] = j;
	            System.out.print(array[i] + " ");
	                  }
	        for (int i = 0; i < array.length; i++) {
	       System.out.print("\n"+array[i]);
	        }
			return 0;
			
		}
		public static int test2(){
			int[] array = new int[50];	        
	        for (int i = 0, j = 1; i < array.length; i++, j+=2) {
	        	array[i] = j;
	            System.out.print(array[i] + " ");
	        }
	        for (int i = array.length - 1; i >= 0; i--) {
	            System.out.print(array[i] + " ");
	           
	        }
	               return 0;
		}
		public static int random(int min, int max){
			return (int) Math.round(Math.random()*(max-min)+min);
		}
		public static void test3(int min, int max){
			int n=0;
			int[] array = new int[15];
			for (int i = 0; i < array.length; i++) {
				if(i%2==0&&i>0)
					n++;
				array[i] = random(min, max);
				System.out.print(array[i] + " ");}
			
				System.out.print("   "+n);
				{
	        }
			
			}
		public static void test4(int min, int max){
				int[] array = new int[8];
				for (int i = 0; i < array.length; i++) {
					array[i] = random(min, max);{
					if(array[i]%2==1)
						array[i]=array[i]-array[i];
					System.out.print(array[i] + " ");
												
					
					}}
			}
		public static void test5(int min, int max){
				int[] array = new int[5];
				for (int i = 0; i < array.length; i++) {
					array[i] = random(min, max);
					System.out.print(" "+array[i]);
					}
				double sum = 0;
			         for( double num : array) {
			          sum = sum + num;
			      }
			      System.out.println(" Avarage: " + sum/5);
			      int[] array1 = new int[5];
					for (int i = 0; i < array1.length; i++) {
						array1[i] = random(min, max);
						System.out.print(" "+array1[i]);}
					double sum1 = 0;
				         for( double num1 : array1) {
				          
				          sum1 = sum1 + num1;
				      }
				      System.out.println(" Avarage: " + sum1/5);
				      if(sum1/5>sum/5)System.out.println("MassEffect2");
				      else if(sum1/5<sum/5)System.out.println("MassEffect1");
				      else{System.out.println("MassEffect3");}
				      
				}
			
		public static void test6(int min, int max){
				int[] array = new int[4];
				for (int i = 0; i < array.length; i++) {
					array[i] = random(min, max);}
				{
					if(array[0]<array[1]&&array[1]<array[2]&&array[2]<array[3]){
						System.out.println("Mass+");
					}else{
						System.out.println("ERORR");
					}
		
				}
			}
		public static int test7(){
				System.out.println("The Fibonnatchi numbers");
				int a = 1;
				int b = 1;
				int n;
				int sum_fib = 0;
				 n = 20;
				 for(int i = 0; i < n; i++){
				 sum_fib = a + b;
				 a = b;
				 b = sum_fib;
				 System.out.print(sum_fib + " ");
				 }
				 return sum_fib;
				}
			
		public static void test8(int min, int max){
				int[] array = new int[12];
				for (int i = 0; i < array.length; i++) {
					array[i] = random(min, max);
					
					System.out.print(array[i]+" ");
				}
				
			}
		public static void test9(int min, int max){
				int OnePiece = 0;
				int[] array0 = new int[10];
				int[] array1 = new int[10];
				double[] array2 = new double[10];
				for (int i = 0; i < 10; i++) {
					array0[i] = random(min, max);
					array1[i] = random(min, max);
					array2[i] = Math.round(((double) array0[i] / (double) array1[i]) * 100.0) / 100.0;
					if (array2[i] == (int) array2[i])
						OnePiece++;
				}
				for (int i = 0; i < 10; i++)
					System.out.print(array0[i] + "\t");
				System.out.println();
				for (int i = 0; i < 10; i++)
					System.out.print(array1[i] + "\t");
				System.out.println();
				for (int i = 0; i < 10; i++)
					System.out.print(array2[i] + "\t");
				System.out.println("\n"+"OnePieces:" + OnePiece);
		}
			
		public static void test10(int min, int max){
			int Millina = 0, Sindel = 0, Kitana = 0;
				int[] array = new int[11];
				for (int i = 0; i < array.length; i++) {
					array[i] = random(min, max);
					System.out.print(array[i] + " ");
					if (array[i] == -1)
						Millina++;
					else if (array[i] == 0)
						Sindel++;
					else
						Kitana++;
				}
				System.out.println();
				if (Millina > Sindel && Millina > Kitana)
					System.out.println("neg max " + Millina);
				else if (Sindel > Millina && Sindel > Kitana)
					System.out.println("zer max " + Sindel);
				else if (Kitana > Millina && Kitana > Sindel)
					System.out.println("plus max " + Kitana);
				else System.out.println("Shao-Kan");
						}
		public static void test81() {
			int mas[] = new int[12];
			int max = 0, maxIndex = 0;
			for (int i = 0; i < 12; i++) {
				mas[i] = (int) (Math.round(Math.random() * 30 - 15));
				System.out.print(mas[i] + " ");
				if (i == 0) {
					max = mas[i];
					maxIndex = i;
				}
				if (i >= 1 && mas[i] > max) {
					max = mas[i];
					maxIndex = i;
				}
			}
			System.out.println("\nmax= " + max + " index= " + maxIndex);
			}
		
			public static void test91() {
				int counter = 0;
				int mas1[] = new int[10];
				int mas2[] = new int[10];
				double mas3[] = new double[10];
				for (int i = 0; i < 10; i++) {
					mas1[i] = (int) (Math.random() * 9 + 1);
					mas2[i] = (int) (Math.random() * 9 + 1);
					mas3[i] = Math.round(((double) mas1[i] / (double) mas2[i]) * 100.0) / 100.0;
					if (mas3[i] == (int) mas3[i])
						counter++;
				}
				for (int i = 0; i < 10; i++)
					System.out.print(mas1[i] + "\t");
				System.out.println();
				for (int i = 0; i < 10; i++)
					System.out.print(mas2[i] + "\t");
				System.out.println();
				for (int i = 0; i < 10; i++)
					System.out.print(mas3[i] + "\t");
				System.out.println("\n" + counter);
				
			}
			public static void test101() {
				int negCount = 0, zerCount = 0, plusCount = 0;
				int mas[] = new int[11];
				for (int i = 0; i < 11; i++) {
					mas[i] = (int) (Math.random() * 3) - 1;
					System.out.print(mas[i] + " ");
					if (mas[i] == -1)
						negCount++;
					else if (mas[i] == 0)
						zerCount++;
					else
						plusCount++;
				}
				System.out.println();
				if (negCount > zerCount && negCount > plusCount)
					System.out.println("neg max " + negCount);
				else if (zerCount > negCount && zerCount > plusCount)
					System.out.println("zer max " + zerCount);
				else
					System.out.println("plus max " + plusCount);
			}
}