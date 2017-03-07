package ua.com.lampshop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.lampshop.entity.Vendor;

public interface VendorDao extends JpaRepository<Vendor, Long> {
	Vendor findByName (String name);
	@Query("SELECT i FROM Vendor i WHERE i.vendorRegion.id = ?1")
	List<Vendor> findByVendorRegionId(Long id);
	@Query("SELECT i FROM Vendor i LEFT JOIN FETCH i.vendorRegion")
	List<Vendor> findAll(Long id);
	@Query("SELECT a FROM Vendor a LEFT JOIN FETCH a.vendorRegion WHERE a.id=?1")
	Vendor findOne(Long id);
}
