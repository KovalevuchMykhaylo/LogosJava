package ua.com.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.TypeOfRoom;


public interface TypeOfRoomDao extends JpaRepository<TypeOfRoom, Integer>{
	TypeOfRoom findByType (String type);
}
