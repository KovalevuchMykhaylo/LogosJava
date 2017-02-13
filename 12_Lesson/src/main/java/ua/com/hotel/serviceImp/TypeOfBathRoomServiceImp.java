package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.TypeOfBathRoomDao;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.service.TypeOfBathRoomService;
@Service
public class TypeOfBathRoomServiceImp implements TypeOfBathRoomService{
	@Autowired
	private TypeOfBathRoomDao typeOfBathRoomDao;

	public void save(TypeOfBathRoom typeOfBathRoom) {
		 typeOfBathRoom.getType().toUpperCase();
		typeOfBathRoomDao.save(typeOfBathRoom);
	}

	public List<TypeOfBathRoom> findAll() {
		return typeOfBathRoomDao.findAll();
	}

	public TypeOfBathRoom findOne(int id) {
		return typeOfBathRoomDao.findOne(id);
	}

	public void delete(int id) {
		typeOfBathRoomDao.delete(id);
	}

	@Override
	public TypeOfBathRoom findByType(String type) {
		return typeOfBathRoomDao.findByType(type);
	}
}
