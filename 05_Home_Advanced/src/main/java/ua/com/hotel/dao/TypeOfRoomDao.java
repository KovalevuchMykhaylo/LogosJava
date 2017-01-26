package ua.com.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hotel.entity.TypeOfRoom;

public class TypeOfRoomDao {
	final EntityManager manager;

	public TypeOfRoomDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(TypeOfRoom typeOfRoom) {
		manager.getTransaction().begin();
		manager.persist(typeOfRoom);
		manager.getTransaction().commit();

	}

	public List<TypeOfRoom> findAll() {

		List<TypeOfRoom> typeOfRoom = manager.createQuery("from TypeOfRoom",TypeOfRoom.class)
				.getResultList();

		return typeOfRoom;
	}

	public TypeOfRoom finOne(String type) {

		TypeOfRoom typeOfRooms = (TypeOfRoom) manager
				.createQuery(
						"select b from TypeOfRoom b where b.type =:param",TypeOfRoom.class)
				.setParameter("param", type).getSingleResult();

		return typeOfRooms;

	}

	public void delete(String type) {
		manager.getTransaction().begin();
		manager.remove(finOne(type));
		manager.getTransaction().commit();
	}

	public void addTypeOfRoom(String TypeOfRoomType) {
		manager.getTransaction().begin();
		TypeOfRoom TypeOfRoom = (TypeOfRoom) manager
				.createQuery(
						"select b from TypeOfRoom b where b.name =:param",TypeOfRoom.class)
				.setParameter("param", TypeOfRoomType).getSingleResult();

		manager.getTransaction().commit();
	}
}
