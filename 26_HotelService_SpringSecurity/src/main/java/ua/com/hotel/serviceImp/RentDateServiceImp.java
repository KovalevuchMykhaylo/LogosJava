package ua.com.hotel.serviceImp;

import java.io.ObjectInputStream.GetField;
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
import ua.com.hotel.dto.form.RentDateForm;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.service.RentDateService;
@Service
public class RentDateServiceImp implements RentDateService{

	@Autowired
	private RentDateDao rentDateDao;
	@Override
	public void save(RentDateForm form) {
//		rentDate.setFirst(LocalDate.parse(rentDate.getFirst().toString().replace('.', '-')));
//		rentDate.setSecond(LocalDate.parse(rentDate.getFirst().toString().replace('.', '-')));
		
//		rentDate.getFirst();
//		rentDate.setFirst(LocalDate.parse((rentDate.getFirst().toString().replace(".", "/"))));
//		rentDate.getSecond();
//		rentDate.setSecond(LocalDate.parse((rentDate.getSecond().toString().replace(".", "/"))));
//		rentDate.setSecond(new LocalDateType(rentDate.getSecond().replace('.', '-')));
//		format = new SimpleDateFormat("dd-M-yyyy
		RentDate entity = new RentDate();
		entity.setFirst(LocalDate.parse(form.getFirst().replace(".", "-")));
		entity.setSecond(LocalDate.parse(form.getSecond().replace(".", "-")));
		entity.setId(form.getId());
		entity.setRoomService(form.getRoomService());
		rentDateDao.save(entity);
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

	@Override
	public RentDateForm finForm(Long id) {
		RentDate entity = findOne(id);
		RentDateForm form = new RentDateForm();
		form.setFirst(String.valueOf(form.getFirst()));
		form.setSecond(String.valueOf(form.getSecond()));
		entity.getId();
		entity.setRoomService(form.getRoomService());
		return form;
	}

}
