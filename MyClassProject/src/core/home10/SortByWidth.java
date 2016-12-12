package core.home10;

import java.util.Comparator;

public class SortByWidth implements Comparator<Comodity>{


	

	@Override
	public int compare(Comodity arg0, Comodity arg1) {
		// TODO Auto-generated method stub
		return arg1.getWidth() - arg0.getWidth();
	}

}