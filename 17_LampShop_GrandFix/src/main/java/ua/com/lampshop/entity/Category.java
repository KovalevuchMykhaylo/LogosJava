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
//Категория
@Entity
@Table(name = "category")
public class Category extends AbstractEntity{
	@Column
	private String name;
	@ManyToMany
	@JoinTable(name = "vendor_categoru", 
	joinColumns=@JoinColumn(name="id_category"),
	inverseJoinColumns=@JoinColumn(name = "id_vendor"))
	private List <Vendor> vendors = new ArrayList<>();
	@ManyToMany(mappedBy = "categorys")
	private List<PlinthType> plinthTypes = new ArrayList<>();
	@OneToMany(mappedBy = "category")
	private List<Item> items = new ArrayList<>();
	public Category() {
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
	public List<PlinthType> getPlinthTypes() {
		return plinthTypes;
	}
	public void setPlinthTypes(List<PlinthType> plinthTypes) {
		this.plinthTypes = plinthTypes;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
