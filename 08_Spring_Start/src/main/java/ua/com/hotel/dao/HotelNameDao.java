package ua.com.hotel.dao;

import java.util.List;

import ua.com.hotel.entity.HotelName;

public interface HotelNameDao {
	void save (HotelName hotelName);
	List<HotelName> findAll();
	HotelName findOne(int id);
	void delete(int id);
}
