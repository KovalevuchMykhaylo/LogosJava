package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.CountryProducerDao;
import ua.com.lampshop.entity.CountryProducer;
import ua.com.lampshop.service.CountryProducerService;

@Service
public class CountryProducerServiceImp implements CountryProducerService{

	@Autowired
	private CountryProducerDao countryProducerDao;
 	
	public void save(CountryProducer countryProducer) {
		countryProducer.getName().toUpperCase();
		countryProducerDao.save(countryProducer);
	}

	public List<CountryProducer> findAll() {
		return countryProducerDao.findAll();
	}

	public CountryProducer findOne(Long id) {
		return countryProducerDao.findOne(id);
	}

	public void delete(Long id) {
		countryProducerDao.delete(id);
	}

	@Override
	public CountryProducer findByName(String name) {
		return countryProducerDao.findByName(name);
	}
}
