package ua.com.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.TypeOfBathRoom;

public interface TypeOfBathRoomDao extends JpaRepository<TypeOfBathRoom, Long> {
	TypeOfBathRoom findByType (String type);
}
