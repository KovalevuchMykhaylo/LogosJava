package ua.com.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.HotelService;

public class HotelServiceDao {
	final EntityManager manager;

	public HotelServiceDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(HotelService hotelService) {
		manager.getTransaction().begin();
		manager.persist(hotelService);
		manager.getTransaction().commit();

	}

	public List<HotelService> findAll() {

		List<HotelService> hotelServices = manager.createQuery(
				"from HotelService",HotelService.class).getResultList();

		return hotelServices;
	}

	public HotelService finOne(String name) {

		HotelService hotelService = (HotelService) manager
				.createQuery(
						"select b from HotelService b where b.name =:param",HotelService.class)
				.setParameter("param", name).getSingleResult();

		return hotelService;

	}

	public void delete(String name) {
		manager.getTransaction().begin();
		manager.remove(finOne(name));
		manager.getTransaction().commit();
	}

	public void addHotelService(String hotelServiceName) {
		manager.getTransaction().begin();
		HotelService hotelService = (HotelService) manager
				.createQuery(
						"select b from HotelService b where b.name =:param",HotelService.class)
				.setParameter("param", hotelServiceName).getSingleResult();

		manager.getTransaction().commit();
	}

}
