package ua.com.lampshop.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Название модели
@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	private BigDecimal price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendor")
	private Vendor vendor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_plinth_type")
	private PlinthType plinthType;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_category")
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_measuring_system")
	private MeasuringSystem measuringSystem;
	public Item(int id, String name, BigDecimal price, Vendor vendor,
			PlinthType plinthType, Category category,
			MeasuringSystem measuringSystem) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.vendor = vendor;
		this.plinthType = plinthType;
		this.category = category;
		this.measuringSystem = measuringSystem;
	}
	public Item(String name, BigDecimal price, Vendor vendor,
			PlinthType plinthType, Category category,
			MeasuringSystem measuringSystem) {
		super();
		this.name = name;
		this.price = price;
		this.vendor = vendor;
		this.plinthType = plinthType;
		this.category = category;
		this.measuringSystem = measuringSystem;
	}
	public Item(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Item() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public PlinthType getPlinthType() {
		return plinthType;
	}
	public void setPlinthType(PlinthType plinthType) {
		this.plinthType = plinthType;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public MeasuringSystem getMeasuringSystem() {
		return measuringSystem;
	}
	public void setMeasuringSystem(MeasuringSystem measuringSystem) {
		this.measuringSystem = measuringSystem;
	}
	
	
}
