package ua.com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//@NamedQueries({
//	@NamedQuery(name = "findAllCitys", query = "select a from City a"),
//	@NamedQuery(name = "findOneCity", query = "select a from City a.name =:param")
//})

//Назва міста в якому знаходиться готель
@Entity
@Table(name = "city")
public class City extends AbstractEntity{
	@Column
	private String name;
	@OneToMany(mappedBy = "city")
	private List<HotelName> hotelNames = new ArrayList<>();
	public City(String name, List<HotelName> hotelNames) {
		super();
		this.name = name;
		this.hotelNames = hotelNames;
	}
	public City(String name) {
		super();
		this.name = name;
	}
	public City() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<HotelName> getHotelNames() {
		return hotelNames;
	}
	public void setHotelNames(List<HotelName> hotelNames) {
		this.hotelNames = hotelNames;
	}
	
}
