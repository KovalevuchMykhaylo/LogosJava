package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.Vendor;

public interface VendorService {
	void save(Vendor vendor);

	List<Vendor> findAll();

	Vendor findOne(Long id);

	void delete(Long id);
	
	Vendor findByName (String name);

	List<Vendor> findByVendorRegionId(Long id);
}
