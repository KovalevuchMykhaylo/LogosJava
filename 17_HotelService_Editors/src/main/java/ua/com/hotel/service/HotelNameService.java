package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.HotelName;

public interface HotelNameService {
	void save(HotelName hotelName);

	List<HotelName> findAll();

	HotelName findOne(Long id);

	void delete(Long id);

	HotelName findByName(String name);

	List<HotelName> findByCityId(Long id);
}
