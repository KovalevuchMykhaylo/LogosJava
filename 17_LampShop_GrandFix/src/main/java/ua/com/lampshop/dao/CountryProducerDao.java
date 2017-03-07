package ua.com.lampshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.lampshop.entity.CountryProducer;

public interface CountryProducerDao extends JpaRepository<CountryProducer, Long>{
	CountryProducer findByName (String name);
	@Query("SELECT a FROM CountryProducer a LEFT JOIN FETCH a.vendors")
	List <CountryProducer> findAll();
}
