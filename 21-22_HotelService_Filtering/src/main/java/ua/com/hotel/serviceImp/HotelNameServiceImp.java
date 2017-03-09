package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.HotelNameDao;
import ua.com.hotel.dto.filter.HotelNameFilter;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.specification.HotelNameSpecification;

@Service
public class HotelNameServiceImp implements HotelNameService {

	@Autowired
	private HotelNameDao hotelNameDao;

	public void save(HotelName hotelName) {
		hotelName.getName().toUpperCase();
		hotelNameDao.save(hotelName);
	}

	public List<HotelName> findAll() {
		return hotelNameDao.findAll();
	}

	public HotelName findOne(Long id) {
		return hotelNameDao.findOne(id);
	}

	public void delete(Long id) {
		hotelNameDao.delete(id);
	}

	@Override
	public HotelName findByName(String name) {
		return hotelNameDao.findByName(name);
	}

	@Override
	public List<HotelName> findByCityId(Long id) {
		return hotelNameDao.findByCityId(id);
	}

	@Override
	public HotelName findUnique(String name) {
		return findByName(name);
	}

	@Override
	public Page<HotelName> findAll(Pageable pageable, HotelNameFilter filter) {
		return hotelNameDao.findAll(new HotelNameSpecification(filter), pageable);
	}

}
