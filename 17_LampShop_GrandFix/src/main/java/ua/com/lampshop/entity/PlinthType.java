package ua.com.lampshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//Тип цоколя
@Entity
@Table(name = "plinth_type")
public class PlinthType extends AbstractEntity{
	@Column
	private String name;
	@ManyToMany
	@JoinTable(name = "vendor_plinth_type", 
	joinColumns=@JoinColumn(name="id_plinth_type"),
	inverseJoinColumns=@JoinColumn(name = "id_vendor"))
	private List <Vendor> vendors = new ArrayList<>();
	@ManyToMany
	@JoinTable(name = "plinth_type_category", 
	joinColumns=@JoinColumn(name="id_plinth_type"),
	inverseJoinColumns=@JoinColumn(name = "id_category"))
	private List <Category> categorys = new ArrayList<>();
	@OneToMany(mappedBy = "plinthType")
	private List <Item> items = new ArrayList<>();
	public PlinthType() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vendor> getVendors() {
		return vendors;
	}
	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}
	public List<Category> getCategorys() {
		return categorys;
	}
	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
