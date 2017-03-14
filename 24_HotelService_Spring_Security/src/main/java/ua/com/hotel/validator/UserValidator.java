package ua.com.hotel.validator;


import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;




import ua.com.hotel.entity.User;
import ua.com.hotel.service.UserService;

public class UserValidator implements Validator{
	
	private final static Pattern REG = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	
	private final UserService userService;

	public UserValidator(UserService userService) {
		this.userService = userService;
	}
	
//	^[-\w.]+@([A-z0-9][-A-z0-9]+\.)+[A-z]{2,4}$

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "", "Can't be empty");
		if(!REG.matcher(user.getEmail()).matches()){
			errors.rejectValue("email", "", "This is not email");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "", "Can't be empty");
		if(userService.findByEmail(user.getEmail())!=null){
			errors.rejectValue("email", "", "Already exist, please try enother");
			}
		}
	}
}
