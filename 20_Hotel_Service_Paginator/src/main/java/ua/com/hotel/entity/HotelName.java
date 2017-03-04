package ua.com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//@NamedQueries({
//	@NamedQuery(name = "findAllHotelName", query = "select a from HotelName a"),
//	@NamedQuery(name = "findOneHotelName", query = "select a from HotelName a.name =:param"),
//})
//Номер номера, кількість кімнат в номері, ціна номера, назва готелю

@Entity
@Table(name = "hotel_name", indexes = @Index(columnList = "name"))
public class HotelName extends AbstractEntity{
	@Column(name = "name")
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_city")
	private City city;
	@OneToMany(mappedBy = "hotelName")
	private List<AditionalService> aditionalServices = new ArrayList<>();
	@OneToMany(mappedBy = "hotelName")
	List<RoomService> roomServices = new ArrayList<>();
	public HotelName(String name, City city,
			List<AditionalService> aditionalServices,
			List<RoomService> roomServices) {
		super();
		this.name = name;
		this.city = city;
		this.aditionalServices = aditionalServices;
		this.roomServices = roomServices;
	}
	public HotelName(String name) {
		super();
		this.name = name;
	}
	public HotelName() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<AditionalService> getAditionalServices() {
		return aditionalServices;
	}
	public void setAditionalServices(List<AditionalService> aditionalServices) {
		this.aditionalServices = aditionalServices;
	}
	public List<RoomService> getRoomServices() {
		return roomServices;
	}
	public void setRoomServices(List<RoomService> roomServices) {
		this.roomServices = roomServices;
	}
	
}
