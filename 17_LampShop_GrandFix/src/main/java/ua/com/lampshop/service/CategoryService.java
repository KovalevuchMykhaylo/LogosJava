package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.Category;

public interface CategoryService {
	void save(Category category);

	List<Category> findAll();

	Category findOne(Long id);

	void delete(Long id);

	Category findByName(String name);
}
