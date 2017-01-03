package core.less2;

public class myPeson {// паторне програмування почитати... 1995 приблизно рік в книжки 4-ри автори. дата трансфер обджект DTO
	int age;
	int dist=5000;
	String name;// this визивает сменную от сюда
	myPeson(int age, String name){// конструктор по умолчанию метод которій ни чего не далат
		System.out.println(this.age+ " " +this.name );// видає нульові значення тут не задаються
		this.age=age;// присваевается значение  с песон))
		this.name=name;		
		System.out.println(this);
	}
	void run(){
		System.out.println(name+": go-go-go");
	}
	void puk(){
		System.out.println(name+": prr-pfu-pshi");
	}
	boolean run(int dist){// методи можна називати однаковими іменами
		if(this.dist<0){
			System.out.println(name+": Game Over");//Спробувати зтворити тоталізатор хто перший пробіжить 5к метрів.
			return false;
		}
		System.out.println(name +":");//Чувак за 10сек написал тотализатор
		return false;
	}
		//this викликає змінну з класу, а не з методу
	//почитать модификатор файнл
}