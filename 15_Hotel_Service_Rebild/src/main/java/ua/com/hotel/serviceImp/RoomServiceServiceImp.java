package ua.com.hotel.serviceImp;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.RoomServiceDao;
import ua.com.hotel.entity.RoomService;
import ua.com.hotel.service.RoomServiceService;

@Service
public class RoomServiceServiceImp implements RoomServiceService{
	@Autowired
	private RoomServiceDao roomServiceDao;

	public void save(RoomService price) {
		roomServiceDao.save(price);
	}

	public List<RoomService> findAll() {
		return roomServiceDao.findAll();
	}

	public RoomService findOne(Long id) {
		return roomServiceDao.findOne(id);
	}

	public void delete(Long id) {
		roomServiceDao.delete(id);
	}

}
