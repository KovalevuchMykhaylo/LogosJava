package ua.com.lampshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
//Страна производитель
@Entity
@Table(name = "country_producer")
public class CountryProducer extends AbstractEntity{
	@Column
	private String name;
	@ManyToMany
	@JoinTable(name = "vendor_country_producer", 
	joinColumns=@JoinColumn(name="id_countyr_producer"),
	inverseJoinColumns=@JoinColumn(name = "id_vendor"))
	private List <Vendor> vendors = new ArrayList<>();
	public CountryProducer() {
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
	
}
