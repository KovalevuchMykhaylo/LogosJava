package ua.com.hotel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.hotel.entity.HotelName;

public interface HotelNameDao extends JpaRepository<HotelName, Long>{
	HotelName findByName (String name);
	
	@Query("SELECT i FROM HotelName i WHERE i.city.id = ?1")
	List<HotelName> findByCityId(Long id);
	
	@Query("SELECT a FROM HotelName a LEFT JOIN FETCH a.city")
	List<HotelName> findAll();
}
