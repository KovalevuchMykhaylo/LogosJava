package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.Item;

public interface ItemService {
	void save(Item model);

	List<Item> findAll();

	Item findOne(Long id);

	void delete(Long id);
	
	Item findByName (String name);

	List<Item> findByCategoryId(Long id);

	List<Item> findByPlinthTypeId(Long id);
}
