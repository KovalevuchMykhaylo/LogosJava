package core.less10my;

import java.util.Comparator;

import core.less9my.Person;

public class PersonComparatorByNameDesc implements Comparator<Person> {

	

	@Override
	public int compare(Person o1, Person o2) {
		return o2.getName().compareTo(o1.getName());
		}
}
	
	

