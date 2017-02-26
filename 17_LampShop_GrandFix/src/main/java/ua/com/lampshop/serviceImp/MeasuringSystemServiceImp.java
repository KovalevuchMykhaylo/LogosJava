package ua.com.lampshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.lampshop.dao.MeasuringSystemDao;
import ua.com.lampshop.entity.MeasuringSystem;
import ua.com.lampshop.service.MeasuringSystemService;

@Service
public class MeasuringSystemServiceImp implements MeasuringSystemService {

	@Autowired
	private MeasuringSystemDao measuringSystemDao;

	public void save(MeasuringSystem measuringSystem) {
		measuringSystem.getName().toUpperCase();
		measuringSystemDao.save(measuringSystem);
	}

	public List<MeasuringSystem> findAll() {
		return measuringSystemDao.findAll();
	}

	public MeasuringSystem findOne(Long id) {
		return measuringSystemDao.findOne(id);
	}

	public void delete(Long id) {
		measuringSystemDao.delete(id);
	}

	@Override
	public MeasuringSystem findByName(String name) {
		return measuringSystemDao.findByName(name);
	}

}
