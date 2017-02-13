package ua.com.hotel.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.City;


public interface CityDao extends JpaRepository<City, Integer>{
	City findByName (String name);
}
