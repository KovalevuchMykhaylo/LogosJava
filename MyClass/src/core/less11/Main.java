package core.less11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		Map<String, List<Person>> map = new HashMap<>();
//		map.put("Manager", new Person("Ivan, 18", 18, Gender.MALE));
//		map.put("Enginer", new Person("Mykola", 15, Gender.MALE));
//		map.put("Manager", new Person("Petro", 26, Gender.MALE));
//		System.out.println(map);
//		System.out.println(map.get("Manager"));
		map.put("Manager", new ArrayList<>());
		map.put("Enginer", new ArrayList<>());
		map.get("Manager").add(new Person("Ivan, 18", 18, Gender.MALE));
		map.get("Manager").add(new Person("Petro", 26, Gender.MALE));
		map.get("Enginer").add(new Person("Mykola", 15, Gender.MALE));
		System.out.println(map);
		
		Set<Entry<String, List<Person>>> entrySet = map.entrySet();
		for (Entry<String, List<Person>> entry : entrySet) {
			String key = entry.getKey();
			for(Person person : entry.getValue()){
				System.out.println(key + "->"+person);
			}
		}
		System.out.println();
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			for(Person person : map.get(key)){
				System.out.println(key + "->"+person);
			}
		}
		System.out.println();
		
		map.forEach((key, value)-> value.forEach(person->System.out.println(key + "->"+person)));
	}

}
