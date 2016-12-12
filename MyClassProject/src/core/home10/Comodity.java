package core.home10;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Comodity {
	
	private String name;
	private int price;
	private int width;
	private int lenght;
	public Comodity(String name, int price, int width, int lenght) {
		super();
		this.name = name;
		this.price = price;
		this.width = width;
		this.lenght = lenght;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	@Override
	public String toString() {
		return "Назва товару: " + name + ",Ціна: " + price + ", Ширина: " + width + ", Довжина:" + lenght + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lenght;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + width;
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
		Comodity other = (Comodity) obj;
		if (lenght != other.lenght)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	

}
