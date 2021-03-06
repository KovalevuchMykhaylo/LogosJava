package ua.com.hotel.serviceImp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import ua.com.hotel.dao.RentDateDao;
import ua.com.hotel.dto.form.RentDateForm;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.entity.User;
import ua.com.hotel.service.RentDateService;
@Service
public class RentDateServiceImp implements RentDateService{

	@Autowired
	private RentDateDao rentDateDao;
	@Override
	public void save(RentDateForm form) {
		RentDate entity = new RentDate();
		entity.setFirst(LocalDate.parse(form.getFirst().replace(".", "-")));
		entity.setSecond(LocalDate.parse(form.getSecond().replace(".", "-")));
		entity.setId(form.getId());
		entity.setRoomService(form.getRoomService());
		entity.setUser(form.getUser());
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
		entity.setUser(form.getUser());
		return form;
	}

	@Override
	public List<RentDate> findAllByUser() {
		return rentDateDao.findAllByUser();
	}

	@Override
	public List <RentDate> findFirstByRoomService(LocalDate first, LocalDate second, Long id) {
		return rentDateDao.findFirstByRoomService(first, second, id);
	}

//	@Override
//	public RentDate findSecondByRoomService(LocalDate first, LocalDate second, Long id) {
//		return rentDateDao.findSecondByRoomService(first, second, id);
//	}

}
