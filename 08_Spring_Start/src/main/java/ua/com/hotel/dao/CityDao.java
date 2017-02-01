package ua.com.hotel.dao;

import java.util.List;

import ua.com.hotel.entity.City;


public interface CityDao {
	void save (City city);
	List<City> findAll();
	City findOne(int id);
	void delete(int id);
}
