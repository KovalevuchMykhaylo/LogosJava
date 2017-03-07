package ua.com.lampshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.lampshop.entity.Item;

public interface ItemDao extends JpaRepository<Item, Long> {
	Item findByName (String name);
	@Query("SELECT i FROM Item i WHERE i.category.id = ?1")
	List<Item> findByCategoryId(Long id);
	@Query("SELECT p FROM Item p WHERE p.plinthType.id = ?1")
	List<Item> findByPlinthTypeId(Long id);
	@Query("SELECT i FROM Item i LEFT JOIN FETCH i.plinthType LEFT JOIN FETCH i.vendor LEFT JOIN FETCH i.measuringSystem LEFT JOIN FETCH i.category")
	List<Item> findAll();

}
