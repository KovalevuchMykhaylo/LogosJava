package ua.com.hotel.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.hotel.entity.HotelName;
import ua.com.hotel.service.HotelNameService;

public class HotelNameValidator implements Validator{
	
	private final HotelNameService hotelNameService;

	public HotelNameValidator(HotelNameService hotelNameService) {
		this.hotelNameService = hotelNameService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return HotelName.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		HotelName hotelName = (HotelName) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can't be empty");
		if(hotelNameService.findByName(hotelName.getName())!=null){
			errors.rejectValue("name", "", "Already exist");
		}
	}
}