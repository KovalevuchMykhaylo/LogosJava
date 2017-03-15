package ua.com.hotel.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.hotel.entity.RentDate;
import ua.com.hotel.service.RentDateService;

public class RentDateValidator implements Validator{
	
//	private final static Pattern REG = Pattern.compile("^([012][1-9]|[3][01])\\.([0][1-9]|[1][012])\\.(20[0-9][0-9]|2100)$");
	
	private final RentDateService rentDateService;

	public RentDateValidator(RentDateService rentDateService) {
		this.rentDateService = rentDateService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return RentDate.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RentDate rentDate = new RentDate();
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "first", "", "Can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "second", "", "Can't be empty");
//		if(rentDate.getFirst().equals(null) & rentDate.getSecond().equals(null)){
//			errors.rejectValue("first", "", "Can be empty");
//			errors.rejectValue("Second", "", "Can be empty");
			
		}
		
	}
	
