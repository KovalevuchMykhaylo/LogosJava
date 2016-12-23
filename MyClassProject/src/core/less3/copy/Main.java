package core.less3.copy;

public class Main {

	public static void main(String[] args) {
		Hunter hunter = new Hunter(5, "Ivan");
		hunter.setName("Ivan");
		hunter.eatMeat("bird meat");
		hunter.eatMeat();
		hunter.eatMeat();
		Human human =new Human(20, "Petro");
		System.out.println(human);
		System.out.println(hunter);
		ValueObject vo = new ValueObject(23, "red");
		System.out.println(vo);
		int size = vo.size;
		int age = hunter.getAge();
		vo = vo.changeSize(34);
		System.out.println(vo);
		Human.countOfPeople();
	}
}
