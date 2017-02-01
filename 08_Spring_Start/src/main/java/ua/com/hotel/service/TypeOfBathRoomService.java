package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.TypeOfBathRoom;

public interface TypeOfBathRoomService {
	void save (TypeOfBathRoom typeOfBathRoom);
	List<TypeOfBathRoom> findAll();
	TypeOfBathRoom findOne(int id);
	void delete(int id);
}
