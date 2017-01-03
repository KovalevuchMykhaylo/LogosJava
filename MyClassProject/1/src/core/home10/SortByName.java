package core.home10;

import java.util.Comparator;

public class SortByName implements Comparator<Comodity> {
	@Override
	public int compare(Comodity o1, Comodity o2) {
		return o1.getName().compareTo(o2.getName());
	}
}