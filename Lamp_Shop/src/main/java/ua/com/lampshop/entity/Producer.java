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
//Країна виробник
@Entity
@Table (name = "producer")
public class Producer {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@OneToMany(mappedBy = "producer")
	private List<Model> model = new ArrayList<>();
	public Producer(String name) {
		super();
		this.name = name;
	}
	public Producer() {
		super();
	}
	
}
