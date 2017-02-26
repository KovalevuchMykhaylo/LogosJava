package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.UserDao;
import ua.com.lampshop.entity.User;
import ua.com.lampshop.service.UserService;

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

	public User findOne(Long id) {
		return userDao.findOne(id);
	}

	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}
}
