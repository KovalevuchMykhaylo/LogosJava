package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.lampshop.entity.User;

public interface UserDao extends JpaRepository<User, Long>{
	User findByName (String name);
}
