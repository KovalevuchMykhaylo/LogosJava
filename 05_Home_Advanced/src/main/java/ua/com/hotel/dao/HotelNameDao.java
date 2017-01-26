package ua.com.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hotel.entity.HotelName;

public class HotelNameDao {
	final EntityManager manager;

	public HotelNameDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(HotelName hotelName) {
		manager.getTransaction().begin();
		manager.persist(hotelName);
		manager.getTransaction().commit();

	}

	public List<HotelName> findAll() {

		List<HotelName> hotelNames = manager.createQuery("from HotelName",HotelName.class)
				.getResultList();

		return hotelNames;
	}

	public HotelName finOne(String name) {

		HotelName hotelName = (HotelName) manager
				.createQuery("select b from HotelName b where b.name =:param",HotelName.class)
				.setParameter("param", name).getSingleResult();

		return hotelName;

	}

	public void delete(String name) {
		manager.getTransaction().begin();
		manager.remove(finOne(name));
		manager.getTransaction().commit();
	}

	public void addhotelName(String hotelNameName) {
		manager.getTransaction().begin();
		HotelName hotelName = (HotelName) manager
				.createQuery("select b from HotelName b where b.name =:param",HotelName.class)
				.setParameter("param", hotelNameName).getSingleResult();

		manager.getTransaction().commit();
	}

}
