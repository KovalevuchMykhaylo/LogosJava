package ua.com.hotel.dao;

import java.util.List;

import ua.com.hotel.entity.TypeOfRoom;


public interface TypeOfRoomDao {
	void save (TypeOfRoom typeOfRoom);
	List<TypeOfRoom> findAll();
	TypeOfRoom findOne(int id);
	void delete(int id);
	
}
