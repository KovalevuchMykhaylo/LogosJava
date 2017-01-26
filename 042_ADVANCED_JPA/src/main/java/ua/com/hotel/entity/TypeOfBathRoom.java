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
import javax.persistence.Table;

@Entity
@Table(name = "type_of_bathroom")
public class TypeOfBathRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@ManyToMany
	@JoinTable(name="type_of_bath_room_hotel_name",
	joinColumns=@JoinColumn(name="id_type_of_bath_room"),
			inverseJoinColumns=@JoinColumn(name = "hotel_name"))
	
	List<HotelName> hotelName = new ArrayList<>();

	public TypeOfBathRoom() {
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
