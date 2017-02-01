package ua.com.hotel.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.hotel.dao.CityDao;
import ua.com.hotel.entity.City;

@Repository
public class CityDaoImp implements CityDao {
	@PersistenceContext(unitName="primary")
	private EntityManager manager;

	@Transactional
	public void save(City city) {
		manager.persist(city);

	}

	@Transactional
	public List<City> findAll() {
		return manager.createQuery("from City").getResultList();
	}

	@Transactional
	public City findOne(int id) {
		return manager.find(City.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
	}

}
