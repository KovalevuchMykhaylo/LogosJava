package ua.com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Назва готелю
@Entity
@Table(name = "hotel_service")
public class HotelService {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	private String name;
	@OneToMany(mappedBy = "hotelService")
	private List<HotelName> hotelName = new ArrayList<>();
	@OneToMany(mappedBy = "hotelService")
	private List<City> city = new ArrayList<>();

	public HotelService() {
		super();
	}

	public HotelService(String name) {
		super();
		this.name = name;
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

	public List<HotelName> getHotelName() {
		return hotelName;
	}

	public void setHotelName(List<HotelName> hotelName) {
		this.hotelName = hotelName;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

}
