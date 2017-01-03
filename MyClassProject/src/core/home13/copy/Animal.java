package core.home13.copy;

public class Animal {

	private String animalName;
	private AnimalType type;
	
	public Animal(String animalName, AnimalType type) {
		super();
		this.animalName = animalName;
		this.type = type;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public AnimalType getType() {
		return type;
	}
	public void setType(AnimalType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animalName == null) ? 0 : animalName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (animalName == null) {
			if (other.animalName != null)
				return false;
		} else if (!animalName.equals(other.animalName))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
}