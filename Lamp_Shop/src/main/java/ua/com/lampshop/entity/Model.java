package ua.com.lampshop.entity;
//Модель лампочики WTF101520
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String model;
	@Column
	private BigDecimal price;
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
