package core.less1;

public class Homecore11 {

	public static void main(String[] args) {
		//compateTo("Hellow", "World");
		compateTo1("Hellow", "World");
		compateTo2("Hellow", "World");

	}
	static int compateTo(String str1, String str2){
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		return 0;
	}
	static int compateTo1(String str1, String str2){
		String a[]={str1, str2};
		for(int j=0; j<a.length; j++){
			for(int i=j; i<a.length; i++){
				if (a[i].compareTo(a[j])<0){
					String helper = a[j];
					a[j]=a[i];
					a[i]=helper;
					System.out.print(a[j]);
				}
			}
		}
		return 0;
		
	}
	static int compateTo2(String str1, String str2){
	str1.chars().forEach(Main::print);
	str2.chars().forEach(Main::print);
	System.out.println(str1.codePointAt(0));
	System.out.println(str1.compareTo(str2));
	System.out.println(str2.codePointAt(0));
	System.out.println(str2.compareTo(str1));
	return 0;
}}