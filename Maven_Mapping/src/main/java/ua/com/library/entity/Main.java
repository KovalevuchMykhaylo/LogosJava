package ua.com.library.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(new Book("LORD", 1234));
		
		Book book = manager.find(Book.class, 1);
		
		book.setPages(1);
		
		manager.merge(book);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
