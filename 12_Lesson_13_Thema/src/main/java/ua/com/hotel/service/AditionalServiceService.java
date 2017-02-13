package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.AditionalService;

public interface AditionalServiceService {
	void save (AditionalService aditionalService);
	List<AditionalService> findAll();
	AditionalService findOne(int id);
	void delete(int id);
	AditionalService findByType (String type);
}
