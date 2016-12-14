package testMap;
import static testMap.Gender.*;

public class Member {
	String name;
	int age;
	Gender gernder;
	public Member(String name, int age, Gender gernder) {
		super();
		this.name = name;
		this.age = age;
		this.gernder = gernder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGernder() {
		return gernder;
	}
	public void setGernder(Gender gernder) {
		this.gernder = gernder;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gernder=" + gernder
				+ "]";
	}
}
