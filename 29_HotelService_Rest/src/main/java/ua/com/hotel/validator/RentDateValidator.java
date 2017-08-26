package ua.com.hotel.validator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.regex.Pattern;

import org.hibernate.type.LocalDateType;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.hotel.dto.form.RentDateForm;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.service.RentDateService;

public class RentDateValidator implements Validator{
	
//	private final static Pattern REG = Pattern.compile("^([012][1-9]|[3][01])\\.([0][1-9]|[1][012])\\.(20[0-9][0-9]|2100)$");
	private final static Pattern REG = Pattern.compile("^(20[0-9][0-9]|2100)\\.([0][1-9]|[1][012])\\.([012][1-9]|[3][01])$");
	
	private final RentDateService rentDateService;

	public RentDateValidator(RentDateService rentDateService) {
		this.rentDateService = rentDateService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return RentDateForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RentDateForm form = (RentDateForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "first", "", "Can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "second", "", "Can't be empty");
		if(!REG.matcher(form.getFirst()).matches() && !REG.matcher(form.getSecond()).matches()){
			errors.rejectValue("first", "", "Can be separated only . or write only numbers");
			errors.rejectValue("second", "", "Can be separated only . or write only numbers");
			if(rentDateService.findFirstByRoomService(LocalDate.parse(form.getFirst()), LocalDate.parse(form.getSecond()))!=null){
//					form.getSecond())>=rentDateService.findFirstByRoomService(form.getRoomService().getId()))!=null){
				errors.rejectValue("first", "", "Allready exists");
			if(rentDateService.findSecondByRoomService(LocalDate.parse(form.getFirst()), LocalDate.parse(form.getSecond()))!=null){
//					form.getSecond())>=rentDateService.findFirstByRoomService(form.getRoomService().getId()))!=null){
				errors.rejectValue("second", "", "Allready exists");
//			if((LocalDate.parse(form.getSecond())<=rentDateService.findByFirst(LocalDate.parse()) &&
//				form.getSecond())>=rentDateService.findFirstByRoomService(id))!=null){
//				errors.rejectValue("first", "", "Allready exists");
//			if(rentDateService.findBySecond(LocalDate.parse(form.getSecond()))!=null){
//				errors.rejectValue("Second", "", "Allready exists");
			}
			
		}
		
	}
	}
}
	
