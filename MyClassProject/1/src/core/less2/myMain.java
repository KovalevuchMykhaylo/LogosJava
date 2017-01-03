package core.less2;

public class myMain {

	public static void main(String[] args) {
		myPeson p = new myPeson (18, "Vanya");//Можно візвать одін раз при созданіі обетка (Конструктор по умолчанию)тег новий створю екземпляр ксаусу Peson
		System.out.println(p);
		p.age = 18;
		p.name ="Vanya";
		System.out.println(p.age);
		System.out.println(p.name);
		myPeson p1 = new myPeson (18, "Vasya");
		p1.age = 18;
		p1.name ="Vasya";
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p1);		
		p.run();
		p1.run();
		p.puk();
		p1.puk();
	}
}