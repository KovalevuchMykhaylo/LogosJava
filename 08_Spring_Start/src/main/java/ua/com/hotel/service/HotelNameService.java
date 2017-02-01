package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.HotelName;

public interface HotelNameService {
	void save (HotelName hotelName);
	List<HotelName> findAll();
	HotelName findOne(int id);
	void delete(int id);
}
