package ua.com.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.HotelName;

public interface HotelNameDao extends JpaRepository<HotelName, Integer>{
	HotelName findByName (String name);
}
