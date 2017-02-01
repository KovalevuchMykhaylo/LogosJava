package ua.com.hotel.dao;

import java.util.List;

import ua.com.hotel.entity.TypeOfBathRoom;

public interface TypeOfBathRoomDao {
	void save(TypeOfBathRoom typeOfBathRoom);

	List<TypeOfBathRoom> findAll();

	TypeOfBathRoom findOne(int id);

	void delete(int id);
}
