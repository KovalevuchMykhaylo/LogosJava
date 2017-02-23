package ua.com.hotel.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.hotel.entity.AditionalService;

public interface AditionalServiceDao extends JpaRepository<AditionalService, Long>{
	AditionalService findByType (String type);
	@Query("SELECT a FROM AditionalService a LEFT JOIN FETCH a.hotelName")
	List<AditionalService> findAll();
	@Query("SELECT a FROM AditionalService a LEFT JOIN FETCH a.hotelName WHERE a.id=?1")
	AditionalService findOne(Long id);
}
