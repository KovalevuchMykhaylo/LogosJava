package ua.com.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hotel.entity.City;

public class CityDao {
	final EntityManager manager;

	public CityDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(City city) {
		manager.getTransaction().begin();
		manager.persist(city);
		manager.getTransaction().commit();

	}

	public List<City> findAll() {

		List<City> citys = manager.createQuery("from City",City.class).getResultList();

		return citys;
	}

	public City finOne(String name) {

		City city = (City) manager
				.createQuery("select b from City b where b.name =:param",City.class)
				.setParameter("param", name).getSingleResult();

		return city;

	}

	public void delete(String name) {
		manager.getTransaction().begin();
		manager.remove(finOne(name));
		manager.getTransaction().commit();
	}

	public void addCity(String cityName) {
		manager.getTransaction().begin();
		City city = (City) manager
				.createQuery("select b from City b where b.name =:param",City.class)
				.setParameter("param", cityName).getSingleResult();

		manager.getTransaction().commit();
	}
}
