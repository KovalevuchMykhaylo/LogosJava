package core.less3.copy;

public class Human {//���� ���� ���� ��������� �� ����� �� ����� ������������ (final)
	int age;
	
	private String name;
	
	private static int count;
	
	public static final int GHJKL_OIUTTR = 1;
	 		
	Human(int age, String name){
		this(age);
		this.name = name;//3
		System.out.println(3);
	}
	
	Human(int age){//����������� ���������� ����� �� ����
		this();//������ ������������ � ����������� ����� ��������� ����� � ������ �����������
		this.age=age;//2
		System.out.println(2);
	}
	
	public Human(){
		count++;
		System.out.println("I was born");//1
		System.out.println("1");
	}
	public static void countOfPeople() {
		System.out.println("Count of people "+ count);
	}
	
	void run(){
		System.out.println(name +":go-go-go");
	}
	public int getAge(){
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;

	}
	public void setName(String name) {
		this.name= name;

	}
	
	public String toString(){
		return "Human[age="+age+", name="+name+"]";
	}

}
