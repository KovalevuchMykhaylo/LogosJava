package ua.com.hotel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.hotel.entity.RoomService;

public interface RoomServiceDao extends JpaRepository<RoomService, Long>{
	@Override
	@Query("SELECT a FROM RoomService a LEFT JOIN FETCH a.hotelName LEFT JOIN FETCH a.typeOfBathRoom LEFT JOIN FETCH a.typeOfRoom")
	List<RoomService> findAll();
	
	@Query("SELECT a FROM RoomService a LEFT JOIN FETCH a.hotelName LEFT JOIN FETCH a.typeOfBathRoom LEFT JOIN FETCH a.typeOfRoom WHERE a.id=?1")
	RoomService findOne(Long id);
	
	@Query("SELECT i FROM RoomService i WHERE i.hotelName.id = ?1")
	List<RoomService> findByHotelNameId(Long id);
}
