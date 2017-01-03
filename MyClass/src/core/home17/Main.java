package core.home17;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception {
		MyClass pf = new MyClass();

		Field f = pf.getClass().getDeclaredField("i");
		f.setAccessible(true);
		f.setInt(pf, 7);
		System.out.println(pf);

		f = pf.getClass().getDeclaredField("s");
		f.setAccessible(true);
		f.set(pf, "Somethink S");
		System.out.println(pf);

		f = pf.getClass().getDeclaredField("s2");
		f.setAccessible(true);
		f.set(pf, "MODIFY S2");
		System.out.println(pf);
	}
}
