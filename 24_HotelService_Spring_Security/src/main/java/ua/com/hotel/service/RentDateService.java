package ua.com.hotel.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.com.hotel.entity.RentDate;

public interface RentDateService {
	
	void save(RentDate rentDate);

	List<RentDate> findAll();

	RentDate findOne(Long id);

	void delete(Long id);

	Page<RentDate> findAll(Pageable pageable);
	
}
