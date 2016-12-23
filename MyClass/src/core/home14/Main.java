package core.home14;


import core.home14.Collection.First;
import core.home14.Collection.Second;
import core.home14.Collection.Second.local;
import core.home14.Collection.OneOfTwo;

	public class Main { 
	public static void main(String[] args) { 
		
		Collection a = new Collection(new Object[10]);
		
		OneOfTwo oneOfTwo = new OneOfTwo(a);
		System.out.println(oneOfTwo);
	
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
			 private void doso() {
				for(int i = 10; i>0; i--){
					if(((i-3)%2)==1){
						System.out.println(i);
					}
				}
			
			}
		};
		
		
	}
} 

	
