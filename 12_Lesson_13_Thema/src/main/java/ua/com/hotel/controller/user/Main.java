package ua.com.hotel.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.Root;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("primary");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

	  	List<Integer> ids = new ArrayList<>(Arrays.asList(1, 5));

		Predicate vendor = root.get("vendor").in(ids);

		ids = new ArrayList<>(Arrays.asList(3, 4));

		Predicate color = root.get("color").in(ids);

		manager.close();
		factory.close();
	}
}
