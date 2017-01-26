package ua.com.hotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "type_of_room")
public class TypeOfRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hotelName")
	private HotelName hotelName;
	public TypeOfRoom() {
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
