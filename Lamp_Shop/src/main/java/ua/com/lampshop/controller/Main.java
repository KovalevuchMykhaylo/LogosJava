package ua.com.lampshop.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		final EntityManagerFactory foctory = Persistence
				.createEntityManagerFactory("primary");
		EntityManager manager = foctory.createEntityManager();

		manager.getTransaction().begin();

		manager.getTransaction().commit();

		manager.close();
		foctory.close();

	}
}