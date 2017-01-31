package ua.com.lampshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Виробник лампы
@Entity
@Table(name = "vendor")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String vendor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendor_region")
	private VendorRegion vendorRegion;
	@OneToMany(mappedBy = "vendor")
	private List<Model> model = new ArrayList<>();
	public Vendor(String vendor) {
		super();
		this.vendor = vendor;
	}
	public Vendor() {
		super();
	}
	
}
