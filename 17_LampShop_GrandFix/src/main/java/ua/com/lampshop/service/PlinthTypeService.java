package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.PlinthType;

public interface PlinthTypeService {
	void save(PlinthType plinthType);

	List<PlinthType> findAll();

	PlinthType findOne(Long id);

	void delete(Long id);
	
	PlinthType findByName (String name);
}
