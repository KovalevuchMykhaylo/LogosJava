package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.PlinthTypeDao;
import ua.com.lampshop.entity.PlinthType;
import ua.com.lampshop.service.PlinthTypeService;

@Service
public class PlinthTypeServiceImp implements PlinthTypeService{
	@Autowired
	private PlinthTypeDao plnthTypeDao;
 	
	public void save(PlinthType plinthType) {
		plinthType.getName().toUpperCase();
		plnthTypeDao.save(plinthType);
	}

	public List<PlinthType> findAll() {
		return plnthTypeDao.findAll();
	}

	public PlinthType findOne(Long id) {
		return plnthTypeDao.findOne(id);
	}

	public void delete(Long id) {
		plnthTypeDao.delete(id);
	}

	@Override
	public PlinthType findByName(String name) {
		return plnthTypeDao.findByName(name);
	}
}
