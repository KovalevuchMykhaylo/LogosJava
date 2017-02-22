package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.RoomService;

public interface RoomServiceService {
	void save(RoomService RoomService);

	List<RoomService> findAll();

	RoomService findOne(Long id);

	void delete(Long id);
	
	List<RoomService> findByHotelNameId(Long id);
}
