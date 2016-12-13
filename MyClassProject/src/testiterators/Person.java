package testiterators;

public class Person {
	String name, gender, sity;
	int age, hight, weight;
	public Person(String name, String gender, String sity, int age, int hight,
			int weight) {
		this.name = name;
		this.gender = gender;
		this.sity = sity;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSity() {
		return sity;
	}
	public void setSity(String sity) {
		this.sity = sity;
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
		return "Person [name=" + name + ", gender=" + gender + ", sity=" + sity
				+ ", age=" + age + ", hight=" + hight + ", weight=" + weight
				+ "]";
	}
	
}
