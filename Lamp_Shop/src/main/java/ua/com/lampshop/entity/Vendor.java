package ua.com.lampshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public Vendor(String vendor) {
		super();
		this.vendor = vendor;
	}
	public Vendor() {
		super();
	}
	
}
