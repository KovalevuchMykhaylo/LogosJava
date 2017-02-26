package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.MeasuringSystem;

public interface MeasuringSystemService {
	void save(MeasuringSystem measuringSystem);

	List<MeasuringSystem> findAll();

	MeasuringSystem findOne(Long id);

	void delete(Long id);

	MeasuringSystem findByName(String name);
}
