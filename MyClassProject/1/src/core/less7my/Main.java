package core.less7my;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ivan");
		list.add("Petro");
		list.add(1, "Mykola"); //так робити не треба
		list.contains("Ivan");
		System.out.println(list);
		System.out.println(list.contains("Ivan"));//contains виведе зачення
		List<String> list2 = new ArrayList<>();
		list2.add("Ivan");
		list2.add("Petro");
		System.out.println(list.contains(list.containsAll(list2)));
		list.forEach(System.out::println);//-> лямда вираз, не як треба, робити, а що треба робити. Интерфейс і його реалізація
		for (String string : list) {
			System.out.println(string);
		}
		for (int i = 0 ; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		list.remove(list.remove(0));
		System.out.println(list);
		System.out.println(list.set(0, "Ivan"));
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		list.add("Mukola");
		System.out.println(list);
//		List<String>list3 = list.subList(0, 1);
//		list.sort(Comparator.naturalOrder());
		LinkedList<String> list3 = new LinkedList<>();
		
	}

}
