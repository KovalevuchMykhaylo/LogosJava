package ua.com.hotel.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.hotel.dao.TypeOfRoomDao;
import ua.com.hotel.entity.TypeOfRoom;
@Repository
public class TypeOfRoomDaoImp implements TypeOfRoomDao{
	@PersistenceContext(unitName="primary")
	private EntityManager manager;

	@Transactional
	public void save(TypeOfRoom typeOfRoom) {
		manager.persist(typeOfRoom);

	}

	@Transactional
	public List<TypeOfRoom> findAll() {
		return manager.createQuery("from TypeOfRoom").getResultList();
	}

	@Transactional
	public TypeOfRoom findOne(int id) {
		return manager.find(TypeOfRoom.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
	}
}
