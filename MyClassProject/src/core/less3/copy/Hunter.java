package core.less3.copy;

public class Hunter extends Human{//Наслідування в клас передаються всі методи з іншого класу найсильніший тип звязку в джава (не можна використовувати)
	
	private int killedMammonts;
	
	Hunter(int age, String name){
		super(age, name);//Викли конструктора з батьківського єлемента і тільки на один рівень вищє
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
	@Override//проверяет ели есть такой метод в отцавском класе анотации используются только для компеляторов
	public void run(){
		System.out.println(getName()+": faster go-go-go");
	}
	public String toString(){
		return "Human[age="+getAge()+", getName="+getName()+", killedMammonts="+killedMammonts+"]";
	}
}
