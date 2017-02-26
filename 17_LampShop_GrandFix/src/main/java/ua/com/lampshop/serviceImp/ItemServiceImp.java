package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.ItemDao;
import ua.com.lampshop.entity.Item;
import ua.com.lampshop.service.ItemService;

@Service
public class ItemServiceImp implements ItemService {
	@Autowired
	private ItemDao itemDao;

	public void save(Item item) {
		item.getName().toUpperCase();
		itemDao.save(item);
	}

	public List<Item> findAll() {
		return itemDao.findAll();
	}

	public Item findOne(Long id) {
		return itemDao.findOne(id);
	}

	public void delete(Long id) {
		itemDao.delete(id);
	}

	@Override
	public List<Item> findByCategoryId(Long id) {
		return itemDao.findByCategoryId(id);
	}

	@Override
	public List<Item> findByPlinthTypeId(Long id) {
		return itemDao.findByPlinthTypeId(id);
	}

	@Override
	public Item findByName(String name) {
		return itemDao.findByName(name);
	}
}
