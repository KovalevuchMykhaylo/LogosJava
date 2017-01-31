package ua.com.lampshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mysql.fabric.xmlrpc.base.Array;

//Країна виробникa
@Entity
@Table (name = "vendor_Region")
public class VendorRegion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String country;
	@OneToMany(mappedBy = "vendorRegion")
	private List<Vendor> vendor = new ArrayList<>();
	public VendorRegion(String country) {
		super();
		this.country = country;
	}
	public VendorRegion() {
		super();
	}
}
