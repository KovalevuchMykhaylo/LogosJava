package ua.com.lampshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.lampshop.entity.VendorRegion;

public interface VendorRegionDao extends JpaRepository<VendorRegion, Long>{
	VendorRegion findByName (String name);

}
