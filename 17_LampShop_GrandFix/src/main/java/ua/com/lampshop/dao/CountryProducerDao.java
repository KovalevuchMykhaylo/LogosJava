package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.lampshop.entity.CountryProducer;

public interface CountryProducerDao extends JpaRepository<CountryProducer, Long>{
	CountryProducer findByName (String name);
}
