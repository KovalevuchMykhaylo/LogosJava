package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.CountryProducer;

public interface CountryProducerService {
	void save(CountryProducer countryProducer);

	List<CountryProducer> findAll();

	CountryProducer findOne(Long id);

	void delete(Long id);

	CountryProducer findByName(String name);
}
