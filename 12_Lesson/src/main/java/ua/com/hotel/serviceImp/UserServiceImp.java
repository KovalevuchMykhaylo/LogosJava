package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.UserDao;
import ua.com.hotel.entity.User;
import ua.com.hotel.service.UserService;
@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userDao;

	public void save(User user) {
		user.getName().toUpperCase();
		userDao.save(user);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findOne(int id) {
		return userDao.findOne(id);
	}

	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}
}
