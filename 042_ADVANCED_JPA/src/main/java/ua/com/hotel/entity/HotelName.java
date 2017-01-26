package ua.com.hotel.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_name")
public class HotelName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private int RoomNumber;
	@Column
	private int rooms;
	@Column
	private BigDecimal price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_city")
	private City city;
	@OneToMany(mappedBy = "hotelName")
	private List<TypeOfRoom> typeOfRoom = new ArrayList<>();
	@ManyToMany(mappedBy = "hotelName")
	private List<TypeOfBathRoom> typeOfBathRoom = new ArrayList<>();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hotel_service")
	private HotelService hotelService;
	@ManyToMany(mappedBy="hotelName")
	private List<AditionalService> aditionalServices = new ArrayList<>();
	
	public HotelName() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<TypeOfRoom> getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(List<TypeOfRoom> typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

}
