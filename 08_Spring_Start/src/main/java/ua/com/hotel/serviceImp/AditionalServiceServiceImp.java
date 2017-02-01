package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.AditionalServiceDao;
import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.service.AditionalServiceService;

@Service
public class AditionalServiceServiceImp implements AditionalServiceService{

	@Autowired
	private AditionalServiceDao aditionalServiceDao;
	
	public void save(AditionalService aditionalService) {
		aditionalService.getType().toUpperCase();
		aditionalServiceDao.save(aditionalService);
	}

	public List<AditionalService> findAll() {
		return aditionalServiceDao.findAll();
	}

	public AditionalService findOne(int id) {
		return aditionalServiceDao.findOne(id);
	}

	public void delete(int id) {
		aditionalServiceDao.delete(id);
	}
	
}
