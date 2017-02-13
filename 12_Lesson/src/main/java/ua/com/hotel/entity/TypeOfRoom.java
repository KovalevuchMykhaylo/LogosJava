package ua.com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Тип номера (первий клас, президенський номер, люкс...)
@Entity
@Table(name = "type_of_room")
public class TypeOfRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@ManyToMany
	@JoinTable(name = "hotel_name_type_of_room", joinColumns=@JoinColumn(name="id_type_of_room"), inverseJoinColumns=@JoinColumn(name = "id_hotel_name"))
	private List <HotelName> hotelName = new ArrayList<>();
	public TypeOfRoom(int id, String type, List<HotelName> hotelName) {
		super();
		this.id = id;
		this.type = type;
		this.hotelName = hotelName;
	}
	public TypeOfRoom(String type, List<HotelName> hotelName) {
		super();
		this.type = type;
		this.hotelName = hotelName;
	}
	public TypeOfRoom(String type) {
		super();
		this.type = type;
	}
	public TypeOfRoom() {
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
	public List<HotelName> getHotelName() {
		return hotelName;
	}
	public void setHotelName(List<HotelName> hotelName) {
		this.hotelName = hotelName;
	}

	
}
