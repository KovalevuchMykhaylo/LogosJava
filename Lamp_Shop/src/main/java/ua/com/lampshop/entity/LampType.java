package ua.com.lampshop.entity;
//Типи лампочок лед фольфрам тд
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lamp_type")
public class LampType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@Column
	private int watt;
	
	public LampType(String type, int watt) {
		super();
		this.type = type;
		this.watt = watt;
	}
	public LampType(String type) {
		super();
		this.type = type;
	}
	public LampType() {
		super();
	}
}
