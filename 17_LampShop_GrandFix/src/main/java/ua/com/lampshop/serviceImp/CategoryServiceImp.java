package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.CategoryDao;
import ua.com.lampshop.entity.Category;
import ua.com.lampshop.service.CategoryService;
@Service
public class CategoryServiceImp implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;

	public void save(Category category) {
		category.getName().toUpperCase();
		categoryDao.save(category);
	}

	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	public Category findOne(Long id) {
		return categoryDao.findOne(id);
	}

	public void delete(Long id) {
		categoryDao.delete(id);
	}

	@Override
	public Category findByName(String name) {
		return categoryDao.findByName(name);
	}

}
