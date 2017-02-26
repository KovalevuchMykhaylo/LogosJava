package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.lampshop.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {
	Category findByName(String name);
}
