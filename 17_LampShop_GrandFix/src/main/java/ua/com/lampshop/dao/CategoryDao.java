package ua.com.lampshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.lampshop.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {
	Category findByName(String name);
	@Query("SELECT a FROM Category a LEFT JOIN FETCH a.vendors")
	List <Category> findAll();
}
