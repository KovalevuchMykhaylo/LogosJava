package ua.com.hotel.serviceImp;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.UserDao;
import ua.com.hotel.entity.Role;
import ua.com.hotel.entity.User;
import ua.com.hotel.service.UserService;
@Service("userDetailsService")
public class UserServiceImp implements UserService, UserDetailsService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setRole(Role.ROLE_USER);
		userDao.save(user);
	}
	
	public void saveSubUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setRole(Role.ROLE_SUBADMIN);
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

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return userDao.findByEmail(username);
	}
	
	@PostConstruct
	public void addAdmin(){
		User user = userDao.findByEmail("admin");
		if(user==null){
			user = new User();
			user.setEmail("admin");
			user.setPassword(encoder.encode("admin"));
			user.setRole(Role.ROLE_ADMIN);
			userDao.save(user);
		}
	}
}
