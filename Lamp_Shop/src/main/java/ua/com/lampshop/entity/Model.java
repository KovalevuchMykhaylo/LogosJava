package ua.com.lampshop.entity;
//Модель лампочики WTF101520
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "model")
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String model;
	@Column
	private BigDecimal price;
	@ManyToOne
	@JoinColumn(name = "id_vendor")
	private Vendor vendor;
	@OneToMany (mappedBy = "model")
	private List <PlinthType> plinthType = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "id_producer")
	private Producer producer;
	@ManyToOne
	@JoinColumn(name = "id_type")
	private Type type;
	@ManyToMany
	@JoinTable(name="measuring_system_model",
	joinColumns=@JoinColumn(name="id_model"),
	inverseJoinColumns=@JoinColumn(name="id_measuring_system"))
	private List<MeasuringSystem> measuringSystems = new ArrayList<>();
	public Model(String model, BigDecimal price) {
		super();
		this.model = model;
		this.price = price;
	}
	public Model(String model) {
		super();
		this.model = model;
	}
	public Model(BigDecimal price) {
		super();
		this.price = price;
	}
	
}
