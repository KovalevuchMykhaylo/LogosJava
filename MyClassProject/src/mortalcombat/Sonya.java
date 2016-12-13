package mortalcombat;

public class Sonya {
	String name = "Sonya";
	int health = 100;
	int kick = (int)(Math.random()*11);
	public Sonya(String name, int health, int kick) {
		this.name = name;
		this.health = health;
		this.kick = kick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getKick() {
		return kick;
	}
	public void setKick(int kick) {
		this.kick = kick;
	}
	@Override
	public String toString() {
		return "Sonya [name=" + name + ", health=" + health + ", kick=" + kick
				+ "]";
	}
	
}