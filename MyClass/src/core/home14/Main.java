package core.home14;

import java.util.Comparator;

import core.home14.Collection.First;
import core.home14.Collection.Second;
import core.home14.Collection.Second.local;
import core.home14.Collection.oneOfTwo;

	public class Main { 
	public static void main(String[] args) { 
	
		Collection c = new Collection(new Object[10]);
		
		for (int i = 0; i < c.getArr().length; i++) { 
		c.getArr()[i] = i+1; 
	} 
	
	Collection.First cs = c. new First(); 
	
	cs.Next(); 
	
	Collection c1 = new Collection(new Object[10]);
	
	for (int i = 0; i < c1.getArr().length; i++) { 
	c1.getArr()[i] = i+1; 
	} 
	
	Collection.Second sc = c1. new Second(); 
	
	sc.Next(); 
	
		 new Collection(new Object[10]) {
			@SuppressWarnings("unused")
			public void doso() {{
				for(int i = 10; i>0; i--){
					if(((i-3)%2)==1){
						System.out.println(i);
					}
				}
			}
				return ;
			}
		};
		Collection m = new Collection();
		System.out.println(m);
		
	}
} 
	
