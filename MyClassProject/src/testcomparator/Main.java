package testcomparator;

import java.util.Arrays;


public class Main {
       
       public static void main(String[] args) {
             Product[] p = new Product[3];
             p[0] = new Product("Milk", 7.56, 56);
             p[1] = new Product("Coffee", 17.00, 32);
             p[2] = new Product("Tea", 12.50, 0);
             
             System.out.println("============ no sorted ==============");
             for(Product i : p) {
                    System.out.println(i);
             }
             
             System.out.println("========== sorted by price===========");

             Arrays.sort(p, new SortedByPrice());
             
             for(Product i : p) {
            	 System.out.println(i);
             }      

             System.out.println("========== sorted by name ===========");
             
             Arrays.sort(p, new SortedByName());
             for(Product i : p) {
            	 System.out.println(i);
             }
       }

}