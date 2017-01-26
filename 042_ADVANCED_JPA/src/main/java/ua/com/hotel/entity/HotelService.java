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


@Entity
@Table(name="hotel_service")
public class HotelService {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	private String name;
	@OneToMany(mappedBy="hotelService")
	private List<HotelName> hotelName = new ArrayList<>();
	@OneToMany(mappedBy="hotelService")
	private List<City> city = new ArrayList<>();

}

