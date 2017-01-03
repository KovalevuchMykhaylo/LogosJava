package testcomparator;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Product> {

	@Override
	public int compare(Product obj1, Product obj2) {
		double price1 = obj1.getPrice();
        double price2 = obj2.getPrice();

        if(price1 > price2) {
               return 1;
        }
        else if(price1 < price2) {
               return -1;
        }
        else {
               return 0;
        }
	}	

}
