package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.User;

public interface UserService {
	void save(User user);

	List<User> findAll();

	User findOne(Long id);

	void delete(Long id);

	User findByName(String name);
}
