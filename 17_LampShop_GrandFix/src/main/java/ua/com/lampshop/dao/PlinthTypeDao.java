package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.lampshop.entity.PlinthType;

public interface PlinthTypeDao extends JpaRepository<PlinthType, Long>{
PlinthType findByName (String name);
}
