package ua.com.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hotel.entity.TypeOfBathRoom;

public class TypeOfBathRoomDao {
	final EntityManager manager;

	public TypeOfBathRoomDao(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(TypeOfBathRoom typeOfBathRoom) {
		manager.getTransaction().begin();
		manager.persist(typeOfBathRoom);
		manager.getTransaction().commit();

	}

	public List<TypeOfBathRoom> findAll() {

		List<TypeOfBathRoom> typeOfBathRooms = manager.createQuery(
				"from TypeOfBathRoom",TypeOfBathRoom.class).getResultList();

		return typeOfBathRooms;
	}

	public TypeOfBathRoom finOne(String type) {

		TypeOfBathRoom typeOfBathRooms = (TypeOfBathRoom) manager
				.createQuery(
						"select b from TypeOfBathRoom b where b.type =:param",TypeOfBathRoom.class)
				.setParameter("param", type).getSingleResult();

		return typeOfBathRooms;

	}

	public void delete(String type) {
		manager.getTransaction().begin();
		manager.remove(finOne(type));
		manager.getTransaction().commit();
	}

	public void addTypeOfBathRoom(String TypeOfBathRoomType) {
		manager.getTransaction().begin();
		TypeOfBathRoom typeOfBathRoom = (TypeOfBathRoom) manager
				.createQuery(
						"select b from TypeOfBathRoom b where b.name =:param",TypeOfBathRoom.class)
				.setParameter("param", TypeOfBathRoomType).getSingleResult();

		manager.getTransaction().commit();
	}
}
