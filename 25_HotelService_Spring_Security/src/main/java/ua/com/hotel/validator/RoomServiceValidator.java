package ua.com.hotel.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.hotel.dto.form.RoomServiceForm;
import ua.com.hotel.service.RoomServiceService;

public class RoomServiceValidator implements Validator{
	
	private final static Pattern REG = Pattern.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");
	
	private final static Pattern REG1 = Pattern.compile("^([0-9])$");
	
	private final RoomServiceService roomServiceService;
	
	public RoomServiceValidator(RoomServiceService roomServiceService) {
		this.roomServiceService = roomServiceService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return RoomServiceForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RoomServiceForm form = (RoomServiceForm) target;
		if(!REG.matcher(form.getPrice()).matches() & !REG1.matcher(form.getRoom()).matches() & !REG1.matcher(form.getRoomNumber()).matches() ){
			errors.rejectValue("price", "", "Can be separated only . or , or write only numbers");
			errors.rejectValue("room", "", "Write only numbers");
			errors.rejectValue("roomNumber", "", "Write only numbers");
		}
		if(errors.getFieldError("price")==null & (errors.getFieldError("room")==null) & (errors.getFieldError("roomNumber")==null)){
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "", "Can't be empty");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "room", "", "Can't be empty");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "roomNumber", "", "Can't be empty");
			if(roomServiceService.findUnique(form.getPrice(), form.getRoom(), form.getRoomNumber(), form.getHotelName(), form.getTypeOfBathRoom(), form.getTypeOfRoom())!=null){
				errors.rejectValue("price", "", "Write only numbers");
				errors.rejectValue("room", "", "Write only numbers");
				errors.rejectValue("roomNumber", "", "Room in this hotel already exist");
			}
		}
	}

}
