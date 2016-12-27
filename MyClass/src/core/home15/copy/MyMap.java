package core.home15.copy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import core.home15.MyEntry;

public class MyMap<K, V> {
	Set<MyEntry<K, V>> set = new HashSet<>();

	public void addSome(K key, V value) {
		System.out.println("--Add--");
		set.add(new MyEntry<K, V>(key, value));
		System.out.println(set);
	}

	public void deleteSomeK(K key) {
		System.out.println("--Remove by key--");
		System.out.println("Enter key");
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if (next.getKey().equals(key)) {
				iter.remove();
			}
		}
		System.out.println(set);
	}

	public void deleteSomeV(String string) {
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if (next.getValue().equals(string)) {
				next.setValue(null);
			}
		}
		System.out.println(set);
	}

	public void getKeys() {
		System.out.println("--Get Keys--");
		Set<K> Keys = new HashSet<>();
		for (MyEntry<K, V> myEntry : set) {
			Keys.add(myEntry.getKey());
		}
		System.out.println(Keys);
	}

	public void getValues() {
		System.out.println("--Get Values--");
		List<V> list = new ArrayList<>();
		for (MyEntry<K, V> myEntry : set) {
			list.add(myEntry.getValue());
		}
		System.out.println(list);
	}

	public void printSomeKV() {
		set.forEach(System.out::println);
	}

}
