package core.home10;

import java.util.Comparator;

public class SortByPrice implements Comparator<Comodity>{
	@Override
	public int compare(Comodity arg0, Comodity arg1) {
		return arg1.getPrice() - arg0.getPrice();
	}
}