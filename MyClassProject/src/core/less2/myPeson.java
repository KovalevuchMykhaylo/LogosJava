package core.less2;

public class myPeson {// ������� ������������� ��������... 1995 ��������� �� � ������ 4-�� ������. ���� �������� ������� DTO
	int age;
	int dist=5000;
	String name;// this �������� ������� �� ����
	myPeson(int age, String name){// ����������� �� ��������� ����� ������ �� ���� �� �����
		System.out.println(this.age+ " " +this.name );// ���� ������ �������� ��� �� ���������
		this.age=age;// ������������� ��������  � �����))
		this.name=name;		
		System.out.println(this);
	}
	void run(){
		System.out.println(name+": go-go-go");
	}
	void puk(){
		System.out.println(name+": prr-pfu-pshi");
	}
	boolean run(int dist){// ������ ����� �������� ���������� �������
		if(this.dist<0){
			System.out.println(name+": Game Over");//���������� �������� ���������� ��� ������ �������� 5� �����.
			return false;
		}
		System.out.println(name +":");//����� �� 10��� ������� �����������
		return false;
	}
		//this ������� ����� � �����, � �� � ������
	//�������� ����������� �����
}