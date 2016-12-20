package core.home13;

import java.util.Scanner;

public class Animal {
	private String nameOfAnimal;
	private TypeOfAnimal t;
	
	public Animal() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть кличку тварини:");
		String nameOfAnimal = sc.nextLine();
		System.out.println("Введіть тип тварини:");
		String typeOfAnimal = sc.nextLine();
		this.nameOfAnimal = nameOfAnimal;
		
		TypeOfAnimal[] type = TypeOfAnimal.values();
		
		for (TypeOfAnimal typeOfAnimal2 : type) {
			if(typeOfAnimal2.name().equals(typeOfAnimal)){
				t = typeOfAnimal2;
			}
		}
		if(t == null){
			System.out.println("Такого типу тварин немає у цьому зооклубі");
		}
		
		
		
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public TypeOfAnimal getT() {
		return t;
	}

	public void setT(TypeOfAnimal t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Animal [nameOfAnimal=" + nameOfAnimal + ", t=" + t + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfAnimal == null) ? 0 : nameOfAnimal.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nameOfAnimal == null) {
			if (other.nameOfAnimal != null)
				return false;
		} else if (!nameOfAnimal.equals(other.nameOfAnimal))
			return false;
		if (t != other.t)
			return false;
		return true;
	}
	
	
	
	
	
}
