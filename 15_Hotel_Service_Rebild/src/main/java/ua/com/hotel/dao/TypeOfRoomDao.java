package ua.com.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.TypeOfRoom;


public interface TypeOfRoomDao extends JpaRepository<TypeOfRoom, Long>{
	TypeOfRoom findByType (String type);
}
