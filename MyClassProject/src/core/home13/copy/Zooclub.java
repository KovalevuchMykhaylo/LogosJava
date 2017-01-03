package core.home13.copy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class Zooclub {

	Map<Human, List<Animal>> map = new HashMap<>();
	List<Animal> list = new ArrayList<>();

	public void addMember(Human m) {
		map.put(m, null);
		System.out.println(map);
	}
	
public void addAnimalToMember(Human human,Animal a){
		
		if(map.containsKey(human)){
		
			Set<Entry<Human,List<Animal>>> set = map.entrySet();
			
			for (Entry<Human, List<Animal>> entry : set) {
				if(entry.getKey().equals(human)){
					list.add(a);
					entry.setValue(list);
					
				}
				System.out.println(entry);
			}
			
		}
	
	}
	public void removeAnimalfromMember(Human h, Animal a){
		Set<Entry<Human,List<Animal>>> set = map.entrySet();
		
			Iterator<Entry<Human, List<Animal>>> iter = set.iterator();
			Iterator<Animal> iterA = list.iterator();
			
			for (Entry<Human, List<Animal>> entry : set) {
				if(entry.getKey().equals(h)){
					while(iterA.hasNext()){
						if(iterA.next().equals(a)){
							iterA.remove();
						}
					}
				}
			}
		
		System.out.println(map);
	}
	
	public void removeMember(Human h){
		
		Set<Human> set = map.keySet();
		Iterator<Human>iter = set.iterator();
		
		while (iter.hasNext()) {
			Human human = (Human) iter.next();
			
			if(human.equals(h)){
				iter.remove();
			}
			
		}
		System.out.println(map);
		
		
	}
	
	public void deleteTypeAnimal(String type){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Set<Entry<Human,List<Animal>>> set = map.entrySet();
		Iterator<Animal> iter= list.iterator();
		
		while(iter.hasNext()){
			if(AnimalType.valueOf(sc.next().toUpperCase()).equals(AnimalType.valueOf(type))){
				iter.remove();
			}
		}
		System.out.println(set);
	}

	@Override
	public String toString() {
		return "Zooclub [map=" + map + "]";
	}

	public void deleteTypeAnimal(AnimalType type) {
		
	}

}