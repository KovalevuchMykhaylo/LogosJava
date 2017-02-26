package ua.com.lampshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//Родина бренда
@Entity
@Table(name = "vendor_region")
public class VendorRegion extends AbstractEntity{
	@Column
	private String name;
	@OneToMany (mappedBy = "vendorRegion")
	private List <Vendor> vendors = new ArrayList<>();
	public VendorRegion() {
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
