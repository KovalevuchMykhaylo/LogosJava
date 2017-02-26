package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.VendorDao;
import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.VendorService;
@Service
public class VendorServiceImp implements VendorService{
	@Autowired
	private VendorDao vendorDao;
 	
	public void save(Vendor vendor) {
		vendor.getName().toUpperCase();
		vendorDao.save(vendor);
	}

	public List<Vendor> findAll() {
		return vendorDao.findAll();
	}

	public Vendor findOne(Long id) {
		return vendorDao.findOne(id);
	}

	public void delete(Long id) {
		vendorDao.delete(id);
	}
	@Override
	public List<Vendor> findByVendorRegionId(Long id) {
		return vendorDao.findByVendorRegionId(id);
	}

	@Override
	public Vendor findByName(String name) {
		return vendorDao.findByName(name);
	}

}
