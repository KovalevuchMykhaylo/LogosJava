package ua.com.hotel.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.hotel.dao.HotelNameDao;
import ua.com.hotel.entity.HotelName;

@Repository
public class HotelNameDaoImp implements HotelNameDao{
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Transactional
	public void save(HotelName hotelName) {
		manager.persist(hotelName);

	}

	@Transactional
	public List<HotelName> findAll() {
		return manager.createQuery("from HotelName").getResultList();
	}

	@Transactional
	public HotelName findOne(int id) {
		return manager.find(HotelName.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
	}
}
