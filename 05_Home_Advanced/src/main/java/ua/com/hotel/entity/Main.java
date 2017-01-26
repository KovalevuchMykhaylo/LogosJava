package ua.com.hotel.entity;


import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		final EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("primary");
		final EntityManager manager = factory.createEntityManager();
		
manager.getTransaction().begin();
		City city = manager.
				createQuery("SELECT c FROM City c WHERE c.name = :name", 
						City.class)
				.setParameter("name", "London")
						.getSingleResult();
		
//		List<City> city = manager.createQuery("SELECT p FROM city p WHERE p.id IN (:ids)", City.class)
//				.setParameter("ids", Arrays.asList(1,2))
//				.getResultList();



	manager.getTransaction().commit();
	manager.close();
		factory.close();

	}
}
