package ua.com.lampshop.entity;
//Типи лампочок лед фольфрам тд
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "type")
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@Column
	private int watt;
	@OneToMany (mappedBy = "type")
	private List<Model> model = new ArrayList<>();
	public Type(String type, int watt) {
		super();
		this.type = type;
		this.watt = watt;
	}
	public Type(String type) {
		super();
		this.type = type;
	}
	public Type() {
		super();
	}
}
