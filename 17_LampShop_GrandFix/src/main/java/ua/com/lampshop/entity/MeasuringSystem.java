package ua.com.lampshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "measuring_system")
public class MeasuringSystem extends AbstractEntity{
	@Column
	private String name;
	@OneToMany(mappedBy = "measuringSystem")
	private List <Item> items = new ArrayList<>();
	public MeasuringSystem() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
