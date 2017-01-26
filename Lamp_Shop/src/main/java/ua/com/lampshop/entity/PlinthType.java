package ua.com.lampshop.entity;
//Тип цоколя лампи
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "plinth_type")
public class PlinthType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	public PlinthType(String type) {
		super();
		this.type = type;
	}
	public PlinthType() {
		super();
	}

}
