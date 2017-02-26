package ua.com.lampshop.service;

import java.util.List;

import ua.com.lampshop.entity.VendorRegion;

public interface VendorRegionService {
	void save(VendorRegion vendorRegion);

	List<VendorRegion> findAll();

	VendorRegion findOne(Long id);

	void delete(Long id);

	VendorRegion findByName(String name);
}
