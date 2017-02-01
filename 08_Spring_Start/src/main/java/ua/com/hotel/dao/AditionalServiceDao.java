package ua.com.hotel.dao;

import java.util.List;

import ua.com.hotel.entity.AditionalService;

public interface AditionalServiceDao {
	void save (AditionalService aditionalService);
	List<AditionalService> findAll();
	AditionalService findOne(int id);
	void delete(int id);

}
