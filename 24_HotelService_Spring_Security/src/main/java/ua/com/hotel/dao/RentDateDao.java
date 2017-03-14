package ua.com.hotel.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.hotel.entity.RentDate;

public interface RentDateDao extends JpaRepository<RentDate, Long>{
	
	@Override
	@Query(value = "SELECT a FROM RentDate a", countQuery = "SELECT count(a.id) FROM RentDate a")
	Page<RentDate> findAll(Pageable pageable);

}
