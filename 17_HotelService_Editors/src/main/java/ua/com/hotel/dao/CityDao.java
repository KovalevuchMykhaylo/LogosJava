package ua.com.hotel.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.City;


public interface CityDao extends JpaRepository<City, Long>{
	City findByName (String name);
	
}
