package core.less3.copy;

public class Hunter extends Human{//����������� � ���� ����������� �� ������ � ������ ����� ����������� ��� ������ � ����� (�� ����� ���������������)
	
	private int killedMammonts;
	
	Hunter(int age, String name){
		super(age, name);//����� ������������ � ������������ �������� � ����� �� ���� ����� ����
		System.out.println("4");
	}
	
	void eatMeat(String meat){
		System.out.println(getName()+": mmm nyam-nyam"+meat);
	}
		
	void eatMeat(){
		run();
		killedMammonts++;
		System.out.println(getName()+": I kill "+killedMammonts+"mammonts");
		eatMeat("mammont meat");
	}
	@Override//��������� ��� ���� ����� ����� � ��������� ����� �������� ������������ ������ ��� ������������
	public void run(){
		System.out.println(getName()+": faster go-go-go");
	}
	public String toString(){
		return "Human[age="+getAge()+", getName="+getName()+", killedMammonts="+killedMammonts+"]";
	}
}
