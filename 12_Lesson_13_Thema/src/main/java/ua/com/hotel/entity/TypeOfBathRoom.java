package ua.com.hotel.entity;

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
import javax.persistence.Table;

//Тип ванної кімнати (душ, ванна, сумісна...)
@Entity
@Table(name = "type_of_bathroom")
public class TypeOfBathRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@ManyToOne
	@JoinColumn(name = "id_hotelName")
	private HotelName hotelName;

	public TypeOfBathRoom(int id, String type, HotelName hotelName) {
		super();
		this.id = id;
		this.type = type;
		this.hotelName = hotelName;
	}

	public TypeOfBathRoom(String type, HotelName hotelName) {
		super();
		this.type = type;
		this.hotelName = hotelName;
	}

	public TypeOfBathRoom(String type) {
		super();
		this.type = type;
	}

	public TypeOfBathRoom() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HotelName getHotelName() {
		return hotelName;
	}

	public void setHotelName(HotelName hotelName) {
		this.hotelName = hotelName;
	}

}
