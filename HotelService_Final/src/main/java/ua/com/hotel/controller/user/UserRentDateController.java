package ua.com.hotel.controller.user;

import static ua.com.hotel.util.ParamBuilder.getParams;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.hotel.dto.form.RentDateForm;
import ua.com.hotel.dto.form.RoomServiceForm;
import ua.com.hotel.editor.HotelNameEditor;
import ua.com.hotel.editor.RoomServiceEditor;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.entity.RoomService;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.entity.User;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.RentDateService;
import ua.com.hotel.service.RoomServiceService;
import ua.com.hotel.service.TypeOfBathRoomService;
import ua.com.hotel.service.TypeOfRoomService;
import ua.com.hotel.service.UserService;
import ua.com.hotel.validator.RentDateValidator;

@Controller
@RequestMapping("/roomService/{id}")
@SessionAttributes("rentDate")
public class UserRentDateController {

	@Autowired
	private RentDateService rentDateService;
	
	@Autowired
	private RoomServiceService roomServiceService;
	
	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private TypeOfBathRoomService typeOfBathRoomService;
	
	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("rentDate")
	public RentDateForm getForm(){
		return new RentDateForm();
	}
	
	@RequestMapping
	public String roomsInHotel(@PathVariable Long id, Model model) {
		model.addAttribute("roomServices", roomServiceService.findOne(id));
		model.addAttribute("typeOfBathRooms", typeOfBathRoomService.findOne(id));
		model.addAttribute("typeOfRooms", typeOfRoomService.findOne(id));
//		model.addAttribute("roomService", roomServiceService.findAll());
		model.addAttribute("user", userService.findOne(getSignedUpUser()));
		return "user-roomService";
	}
	
	@InitBinder("rentDate")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new RentDateValidator(rentDateService));
		binder.registerCustomEditor(RoomService.class, new RoomServiceEditor(roomServiceService));
	}
	
	@PostMapping
	public String save(@PathVariable Long id, @ModelAttribute ("rentDate") @Valid RentDateForm rentDateForm, BindingResult br, Model model, SessionStatus status){
		if(br.hasErrors()) return roomsInHotel(id, model);
		rentDateForm.setUser(userService.findOne(getSignedUpUser()));
		rentDateService.save(rentDateForm);
		status.setComplete();
		return "redirect:/roomService/"+id;
	}
	
	public static Long getSignedUpUser() {
		final SecurityContext ctx = SecurityContextHolder.getContext();

		if (ctx != null) {
			final Authentication auth = ctx.getAuthentication();

			if (auth != null) {
				final Object principal = auth.getPrincipal();

				if (principal instanceof User) {
					final User au = (User) principal;
					return au.getId();
				}
			}
		}

		return (long) 0;
	}
}
