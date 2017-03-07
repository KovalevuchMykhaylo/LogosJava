package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.AditionalServiceDao;
import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.entity.HotelName;
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

	public AditionalService findOne(Long id) {
		return aditionalServiceDao.findOne(id);
	}

	public void delete(Long id) {
		aditionalServiceDao.delete(id);
	}

	@Override
	public AditionalService findByType(String type) {
		return aditionalServiceDao.findByType(type);
	}

	@Override
	public AditionalService findUnique(String type, HotelName hotelName) {
		return aditionalServiceDao.findUnique(type, hotelName.getId());
	}

}
