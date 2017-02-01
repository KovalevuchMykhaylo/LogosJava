package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.TypeOfRoom;


public interface TypeOfRoomService {
	void save (TypeOfRoom typeOfRoom);
	List<TypeOfRoom> findAll();
	TypeOfRoom findOne(int id);
	void delete(int id);
	
}
