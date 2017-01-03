package core.less1;

public class Homecore1 {

	public static void main(String[] args) {
		compateTo("Hellow", "World");

	}
	static int compateTo(String str1, String str2){
		System.out.println(str1.compareTo(str2));//надо било писать чар єд
		System.out.println(str2.compareTo(str1));
		System.out.println("First world long"+str1.length());
		System.out.println("Second world long"+str2.length());
		if(str1.length()>str2.length()){
			System.out.println("First world longer");
		}else{
			System.out.println("Second world longer");
		}

		return 0;
	}
	
}