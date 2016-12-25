package core.home15;

import java.io.Serializable;

public class MyEntry<K, V> implements Serializable {

	private static final long serialVersionUID = 5139123533162365557L;

	private K Key;

	private V Value;

	public MyEntry(K key, V value) {
		Key = key;
		Value = value;
	}

	public K getKey() {
		return Key;
	}

	public void setKey(K key) {
		Key = key;
	}

	public V getValue() {
		return Value;
	}

	public void setValue(V value) {
		Value = value;
	}

	@Override
	public String toString() {
		return "MyEntry [Key=" + Key + ", Value=" + Value + "]";
	}

}