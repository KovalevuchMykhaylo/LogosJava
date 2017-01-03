package core.home15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import core.home15.MyEntry;

public class MyMap<K, V> {
	Set<MyEntry<K, V>> set;

	public void addSome(K key, V value) {
		set.add(new MyEntry<K, V>(key, value));
		System.out.println(set);
	}

	public void deleteSomeK(K key) {
		System.out.println("Enter key");
		Scanner sc = new Scanner(System.in);
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if (next.getKey().equals(sc.next())) {
				iter.remove();
			}
		}
		System.out.println(set);
		sc.close();
	}

	public void deleteSomeV(V value) {
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if (next.getValue().equals(value)) {
				next.setValue(null);
			}
		}
		System.out.println(set);
		sc.close();
	}

	public void getKeys(K key) {
		System.out.println("---------getKeys--------------");
		Set<K> keys = new HashSet<>();
		for (MyEntry<K, V> myEntry : set) {
			keys.add(myEntry.getKey());
		}
		System.out.println(keys);
	}

	public void getValues(V value) {
		System.out.println("GetValues");
		List<V> values = new ArrayList<>();
		for (MyEntry<K, V> myEntry : set) {
			values.add(myEntry.getValue());
		}
		System.out.println(values);
	}

	public void printSomeKV() {
		set.forEach(System.out::println);
	}
}
