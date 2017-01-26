package ua.com.lampshop.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Країна виробник
public class VendorRegion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String country;
	public VendorRegion(String country) {
		super();
		this.country = country;
	}
	public VendorRegion() {
		super();
	}
	
}
