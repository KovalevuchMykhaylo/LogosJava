package ua.com.hotel.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.hotel.dao.TypeOfBathRoomDao;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.TypeOfBathRoom;
@Repository
public class TypeOfBathRoomDaoImp implements TypeOfBathRoomDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;

	@Transactional
	public void save(TypeOfBathRoom typeOfBathRoom) {
		manager.persist(typeOfBathRoom);

	}

	@Transactional
	public List<TypeOfBathRoom> findAll() {
		return manager.createQuery("from TypeOfBathRoom").getResultList();
	}

	@Transactional
	public TypeOfBathRoom findOne(int id) {
		return manager.find(TypeOfBathRoom.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
	}
}
