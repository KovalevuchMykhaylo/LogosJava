package ua.com.hotel.serviceImp;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.type.LocalDateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.RentDateDao;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.service.RentDateService;
@Service
public class RentDateServiceImp implements RentDateService{

	@Autowired
	private RentDateDao rentDateDao;
	@Override
	public void save(RentDate rentDate) {
//		rentDate.setFirst(LocalDate.parse(rentDate.getFirst().toString().replace('.', '-')));
//		rentDate.setSecond(LocalDate.parse(rentDate.getFirst().toString().replace('.', '-')));
		
		rentDate.getFirst();
		rentDate.setFirst(LocalDate.parse((rentDate.getFirst().toString().replace(".", "/"))));
		rentDate.getSecond();
		rentDate.setSecond(LocalDate.parse((rentDate.getSecond().toString().replace(".", "/"))));
//		rentDate.setSecond(new LocalDateType(rentDate.getSecond().replace('.', '-')));
		rentDateDao.save(rentDate);
	}

	@Override
	public List<RentDate> findAll() {
		return rentDateDao.findAll();
	}

	@Override
	public RentDate findOne(Long id) {
		return rentDateDao.findOne(id);
	}

	@Override
	public void delete(Long id) {
		rentDateDao.delete(id);
	}

	@Override
	public Page<RentDate> findAll(Pageable pageable) {
		return rentDateDao.findAll(pageable);
	}

}
