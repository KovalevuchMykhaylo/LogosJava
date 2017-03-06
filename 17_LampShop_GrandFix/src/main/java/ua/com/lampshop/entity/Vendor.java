package ua.com.lampshop.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//Производитель
@Entity
@Table(name = "vendor")
public class Vendor extends AbstractEntity{
	@Column
	private String name;
	@ManyToMany(mappedBy = "vendors")
	private List <CountryProducer> countryProducers = new ArrayList<>();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendor_regoin")
	private VendorRegion vendorRegion;
	@ManyToMany(mappedBy = "vendors")
	private List <Category> categorys = new ArrayList<>();
	@OneToMany(mappedBy = "vendor")
	private List <Item> items = new ArrayList<>();
	public Vendor() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CountryProducer> getCountryProducers() {
		return countryProducers;
	}
	public void setCountryProducers(List<CountryProducer> countryProducers) {
		this.countryProducers = countryProducers;
	}
	public VendorRegion getVendorRegion() {
		return vendorRegion;
	}
	public void setVendorRegion(VendorRegion vendorRegion) {
		this.vendorRegion = vendorRegion;
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
