package ua.com.hotel.service;

import java.util.List;

import ua.com.hotel.entity.User;


public interface UserService {
	void save (User user);
	List<User> findAll();
	User findOne(int id);
	void delete(int id);
	User findByName (String name);
}
