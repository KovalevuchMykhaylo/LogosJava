package testiterators;

public class Person {
	String name, sity;
	Gender gender;
	int age, hight, weight;
	
	public Person(String name, String sity, Gender gender, int age, int hight,
			int weight) {
		super();
		this.name = name;
		this.sity = sity;
		this.gender = gender;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSity() {
		return sity;
	}

	public void setSity(String sity) {
		this.sity = sity;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sity=" + sity + ", gender=" + gender
				+ ", age=" + age + ", hight=" + hight + ", weight=" + weight
				+ "]";
	}
}