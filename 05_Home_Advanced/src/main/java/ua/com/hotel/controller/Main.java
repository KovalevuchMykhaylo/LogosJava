package ua.com.hotel.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.com.hotel.dao.AditionalServiceDao;
import ua.com.hotel.dao.CityDao;
import ua.com.hotel.dao.HotelNameDao;
import ua.com.hotel.dao.HotelServiceDao;
import ua.com.hotel.dao.TypeOfBathRoomDao;
import ua.com.hotel.dao.TypeOfRoomDao;
import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.entity.City;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.HotelService;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.entity.TypeOfRoom;

public class Main {
	final private static Scanner sc = new Scanner(System.in);
	final private static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("primary");
	final private static EntityManager manager = factory.createEntityManager();

	public static void main(String[] args) {

		while (true) {
			System.out
					.println("Enter 1 to do something with aditional services:");
			System.out.println("Enter 2 to do something with citys:");
			System.out.println("Enter 3 to do something with hotel names:");
			System.out
					.println("Enter 4 to do something with price, room numbers and room prices:");
			System.out
					.println("Enter 5 to do something with type of bathrooms:");
			System.out.println("Enter 6 to do something with type of rooms:");
			switch (sc.next()) {
			case "1":
				aditionalServiceMenu();
				break;
			case "2":
				System.out.println("Enter 2 to do something with citys:");
				cityMenu();
				break;
			case "3":
				System.out.println("Enter 3 to do something with hotel names:");
				servisMenu();
				break;
			case "4":
				System.out
						.println("Enter 4 to do something with price, room numbers and room prices:");
				hotelNameMenu();
				break;
			case "5":
				System.out
						.println("Enter 5 to do something with type of bathrooms:");
				typeOfBathRoomsMenu();
				break;
			case "6":
				System.out
						.println("Enter 6 to do something with type of rooms:");
				typeRoomsMenu();
				break;

			default:
				sc.close();
				return;
			}
			manager.close();
			factory.close();

		}
	}

	private static void aditionalServiceMenu() {
		System.out.println("Enter 1 to save/add:");
		System.out.println("Enter 2 to findAll:");
		System.out.println("Enter 3 to finOne:");
		System.out.println("Enter 4 to delete:");
		while (true) {
			AditionalServiceDao aditionalServiceDao = new AditionalServiceDao(
					manager);
			switch (sc.next()) {
			case "1":
				aditionalServiceDao.save(new AditionalService(sc.next()));
				break;
			case "2":
				System.out.println(aditionalServiceDao.findAll());
				break;
			case "3":
				System.out.println(aditionalServiceDao.finOne(sc.next()));
				break;
			case "4":
				aditionalServiceDao.delete(sc.next());
				break;
			default:
				return;
			}

		}
	}
	private static void cityMenu() {
		System.out.println("Enter 1 to save/add:");
		System.out.println("Enter 2 to findAll:");
		System.out.println("Enter 3 to finOne:");
		System.out.println("Enter 4 to delete:");
		while (true) {
			CityDao cityDao = new CityDao(
					manager);
			switch (sc.next()) {
			case "1":
				cityDao.save(new City(sc.next()));
				break;
			case "2":
				System.out.println(cityDao.findAll());
				break;
			case "3":
				System.out.println(cityDao.finOne(sc.next()));
				break;
			case "4":
				cityDao.delete(sc.next());
				break;
			default:
				return;
			}
		}
	}
		private static void servisMenu() {
			System.out.println("Enter 1 to save/add:");
			System.out.println("Enter 2 to findAll:");
			System.out.println("Enter 3 to finOne:");
			System.out.println("Enter 4 to delete:");
			while (true) {
				HotelServiceDao hotelServiceDao = new HotelServiceDao(
						manager);
				switch (sc.next()) {
				case "1":
					hotelServiceDao.save(new HotelService(sc.next()));
					break;
				case "2":
					System.out.println(hotelServiceDao.findAll());
					break;
				case "3":
					System.out.println(hotelServiceDao.finOne(sc.next()));
					break;
				case "4":
					hotelServiceDao.delete(sc.next());
					break;
				default:
					return;
				}

			}
		}
	private static void hotelNameMenu() {
		System.out.println("Enter 1 to save/add:");
		System.out.println("Enter 2 to findAll:");
		System.out.println("Enter 3 to finOne:");
		System.out.println("Enter 4 to delete:");
		while (true) {
			HotelNameDao hotelNameDao = new HotelNameDao(
					manager);
			switch (sc.next()) {
			case "1":
				hotelNameDao.save(new HotelName(sc.nextInt(), null));
				break;
			case "2":
				System.out.println(hotelNameDao.findAll());
				break;
			case "3":
				System.out.println(hotelNameDao.finOne(sc.next()));
				break;
			case "4":
				hotelNameDao.delete(sc.next());
				break;
			default:
				return;
			}
		}
	}
	private static void typeRoomsMenu() {
		System.out.println("Enter 1 to save/add:");
		System.out.println("Enter 2 to findAll:");
		System.out.println("Enter 3 to finOne:");
		System.out.println("Enter 4 to delete:");
		while (true) {
			TypeOfRoomDao typeOfRoomDao = new TypeOfRoomDao(
					manager);
			switch (sc.next()) {
			case "1":
				typeOfRoomDao.save(new TypeOfRoom(sc.next()));
				break;
			case "2":
				System.out.println(typeOfRoomDao.findAll());
				break;
			case "3":
				System.out.println(typeOfRoomDao.finOne(sc.next()));
				break;
			case "4":
				typeOfRoomDao.delete(sc.next());
				break;
			default:
				return;
			}
		}
	}
	private static void typeOfBathRoomsMenu() {
		System.out.println("Enter 1 to save/add:");
		System.out.println("Enter 2 to findAll:");
		System.out.println("Enter 3 to finOne:");
		System.out.println("Enter 4 to delete:");
		while (true) {
			TypeOfBathRoomDao typeOfBathRoomDao = new TypeOfBathRoomDao(
					manager);
			switch (sc.next()) {
			case "1":
				typeOfBathRoomDao.save(new TypeOfBathRoom(sc.next()));
				break;
			case "2":
				System.out.println(typeOfBathRoomDao.findAll());
				break;
			case "3":
				System.out.println(typeOfBathRoomDao.finOne(sc.next()));
				break;
			case "4":
				typeOfBathRoomDao.delete(sc.next());
				break;
			default:
				return;
			}
		}
	}
}
