package ua.com.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hotel.entity.AditionalService;

public class AditionalServiceDao {
	final EntityManager manager;

	public AditionalServiceDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(AditionalService aditionalService) {
		manager.getTransaction().begin();
		manager.persist(aditionalService);
		manager.getTransaction().commit();

	}

	public List<AditionalService> findAll() {
		List<AditionalService> aditionalservices = manager.createQuery(
				"Select e from AditionalService e",AditionalService.class).getResultList();
		return aditionalservices;
	}

	public AditionalService finOne(String type) {

		AditionalService aditionalservice = (AditionalService) manager
				.createQuery(
						"select b from AditionalService b where b.type =:param",AditionalService.class)
				.setParameter("param", type).getSingleResult();

		return aditionalservice;

	}

	public void delete(String type) {
		manager.getTransaction().begin();
		manager.remove(finOne(type));
		manager.getTransaction().commit();
	}

	public void addAditionalService(String aditionalserviceType) {
		manager.getTransaction().begin();
		AditionalService aditionalService = (AditionalService) manager
				.createQuery(
						"select b from AditionalService b where b.name =:param",AditionalService.class)
				.setParameter("param", aditionalserviceType).getSingleResult();

		manager.getTransaction().commit();
	}
}
