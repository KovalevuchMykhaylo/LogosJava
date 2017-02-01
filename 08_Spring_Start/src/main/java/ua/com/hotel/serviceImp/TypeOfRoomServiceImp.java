package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.TypeOfRoomDao;
import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.TypeOfRoomService;
@Service
public class TypeOfRoomServiceImp implements TypeOfRoomService{

		@Autowired
		private TypeOfRoomDao typeOfRoomDao;

		public void save(TypeOfRoom typeOfRoom) {
			 typeOfRoom.getType().toUpperCase();
			typeOfRoomDao.save(typeOfRoom);
		}

		public List<TypeOfRoom> findAll() {
			return typeOfRoomDao.findAll();
		}

		public TypeOfRoom findOne(int id) {
			return typeOfRoomDao.findOne(id);
		}

		public void delete(int id) {
			typeOfRoomDao.delete(id);
		}
}
