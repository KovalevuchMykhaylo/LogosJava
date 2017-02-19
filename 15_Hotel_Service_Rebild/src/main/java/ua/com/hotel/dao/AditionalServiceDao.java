package ua.com.hotel.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hotel.entity.AditionalService;

public interface AditionalServiceDao extends JpaRepository<AditionalService, Long>{
	AditionalService findByType (String type);

}
