package ua.com.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.CityDao;
import ua.com.hotel.dto.filter.SimpleFilter;
import ua.com.hotel.entity.City;
import ua.com.hotel.service.CityService;

@Service
public class CityServiceImp implements CityService {
	@Autowired
	private CityDao cityDao;

	public void save(City city) {
		city.getName().toUpperCase();
		cityDao.save(city);
	}

	public List<City> findAll() {
		return cityDao.findAll();
	}

	public City findOne(Long id) {
		return cityDao.findOne(id);
	}

	public void delete(Long id) {
		cityDao.delete(id);
	}

	@Override
	public City findByName(String name) {
		return cityDao.findByName(name);
	}

	@Override
	public Page<City> findAll(Pageable pageable, SimpleFilter filter) {
		return cityDao.findAll(findByNameLike(filter), pageable);
	}

	private Specification<City> findByNameLike(SimpleFilter filter) {
		return (root, query, cb)->{
			if(filter.getSearch().isEmpty())return null;
			return cb.like(cb.lower(root.get("name")), filter.getSearch().toLowerCase()+"%");
		};
	}

}
