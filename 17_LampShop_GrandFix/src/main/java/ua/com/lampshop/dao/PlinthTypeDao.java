package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.lampshop.entity.PlinthType;

public interface PlinthTypeDao extends JpaRepository<PlinthType, Long>{
PlinthType findByName (String name);

//@Query("SELECT a FROM PlinthType a LEFT JOIN FETCH a.category WHERE a.id=?1")
//PlinthType findOne(Long id);
}
