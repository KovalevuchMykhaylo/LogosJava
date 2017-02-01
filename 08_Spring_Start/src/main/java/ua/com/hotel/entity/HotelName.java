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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//@NamedQueries({
//	@NamedQuery(name = "findAllHotelName", query = "select a from HotelName a"),
//	@NamedQuery(name = "findOneHotelName", query = "select a from HotelName a.name =:param"),
//})
//Номер номера, кількість кімнат в номері, ціна номера, назва готелю

@Entity
@Table(name = "hotel_name")
public class HotelName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;

	private int RoomNumber;
	private int rooms;
	private BigDecimal price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_city")
	private City city;
	@OneToMany(mappedBy = "hotelName")
	private List<AditionalService> aditionalService = new ArrayList<>();
	@OneToMany(mappedBy = "hotelName")
	private List<TypeOfBathRoom> typeOfBathRoom = new ArrayList<>();
	@OneToMany(mappedBy = "hotelName")
	private List<TypeOfRoom> typeOfRoom = new ArrayList<>();

	public HotelName(int id, String name, int roomNumber, int rooms,
			BigDecimal price, City city,
			List<AditionalService> aditionalService,
			List<TypeOfBathRoom> typeOfBathRoom, List<TypeOfRoom> typeOfRoom) {
		super();
		this.id = id;
		this.name = name;
		RoomNumber = roomNumber;
		this.rooms = rooms;
		this.price = price;
		this.city = city;
		this.aditionalService = aditionalService;
		this.typeOfBathRoom = typeOfBathRoom;
		this.typeOfRoom = typeOfRoom;
	}

	public HotelName(String name, int roomNumber, int rooms, BigDecimal price,
			City city, List<AditionalService> aditionalService,
			List<TypeOfBathRoom> typeOfBathRoom, List<TypeOfRoom> typeOfRoom) {
		super();
		this.name = name;
		RoomNumber = roomNumber;
		this.rooms = rooms;
		this.price = price;
		this.city = city;
		this.aditionalService = aditionalService;
		this.typeOfBathRoom = typeOfBathRoom;
		this.typeOfRoom = typeOfRoom;
	}

	public HotelName(String name) {
		super();
		this.name = name;
	}

	public HotelName() {
		super();
	}

	public HotelName(int id, String name, int roomNumber, int rooms,
			BigDecimal price, HotelName hotelName) {
		super();
		this.id = id;
		this.name = name;
		RoomNumber = roomNumber;
		this.rooms = rooms;
		this.price = price;
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

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<AditionalService> getAditionalService() {
		return aditionalService;
	}

	public void setAditionalService(List<AditionalService> aditionalService) {
		this.aditionalService = aditionalService;
	}

	public List<TypeOfBathRoom> getTypeOfBathRoom() {
		return typeOfBathRoom;
	}

	public void setTypeOfBathRoom(List<TypeOfBathRoom> typeOfBathRoom) {
		this.typeOfBathRoom = typeOfBathRoom;
	}

	public List<TypeOfRoom> getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(List<TypeOfRoom> typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

}
