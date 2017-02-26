package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.lampshop.entity.MeasuringSystem;

public interface MeasuringSystemDao extends JpaRepository<MeasuringSystem, Long>{
MeasuringSystem findByName (String name);
}
