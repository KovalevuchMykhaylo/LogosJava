package core.home11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Zooclub {
	Map<Human, List<Animal>> map;
	List<Animal> l =new ArrayList<Animal>();
	
	
	public Zooclub(){
		map = new HashMap<>();
	}
	
	public void addMember(Human m){
		map.put(m, null);
		System.out.println(map);
	}
	
	public void addAnimalToMember(Human human,Animal a){
		
		if(map.containsKey(human)){
		
			Set<Entry<Human,List<Animal>>> set = map.entrySet();
			
			for (Entry<Human, List<Animal>> entry : set) {
				if(entry.getKey().equals(human)){
					l.add(a);
					entry.setValue(l);
					
				}
				System.out.println(entry);
			}
			
		}
	
	}
	public void removeAnimalfromMember(Human h, Animal a){
		Set<Entry<Human,List<Animal>>> set = map.entrySet();
		
			Iterator<Entry<Human, List<Animal>>> iter = set.iterator();
			Iterator<Animal> iterA = l.iterator();
			
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
		Set<Entry<Human,List<Animal>>> set = map.entrySet();
		Iterator<Animal> iter= l.iterator();
		
		while(iter.hasNext()){
			if(iter.next().getT().name().equalsIgnoreCase(type)){
				iter.remove();
			}
		}
		System.out.println(set);
	}

	@Override
	public String toString() {
		return "Zooclub [map=" + map + "]";
	}
	
}
