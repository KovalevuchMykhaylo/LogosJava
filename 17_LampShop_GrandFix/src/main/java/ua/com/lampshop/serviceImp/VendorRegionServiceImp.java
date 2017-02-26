package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.VendorRegionDao;
import ua.com.lampshop.entity.VendorRegion;
import ua.com.lampshop.service.VendorRegionService;
@Service
public class VendorRegionServiceImp implements VendorRegionService {
	@Autowired
	private VendorRegionDao vendorRegionDao;
 	
	public void save(VendorRegion vendorRegion) {
		vendorRegion.getName().toUpperCase();
		vendorRegionDao.save(vendorRegion);
	}

	public List<VendorRegion> findAll() {
		return vendorRegionDao.findAll();
	}

	public VendorRegion findOne(Long id) {
		return vendorRegionDao.findOne(id);
	}

	public void delete(Long id) {
		vendorRegionDao.delete(id);
	}

	@Override
	public VendorRegion findByName(String name) {
		return vendorRegionDao.findByName(name);
	}
}
