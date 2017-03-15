package ua.com.hotel.controller.user;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.com.hotel.entity.User;
import ua.com.hotel.service.AditionalServiceService;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.RoomServiceService;
import ua.com.hotel.service.TypeOfBathRoomService;
import ua.com.hotel.service.TypeOfRoomService;
import ua.com.hotel.service.UserService;
import ua.com.hotel.validator.TypeOfRoomValidator;
import ua.com.hotel.validator.UserValidator;

@Controller
public class IndexController {

	@Autowired
	private CityService cityService;

	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private RoomServiceService roomServiceService;

	@Autowired
	private TypeOfBathRoomService typeOfBathRoomService;
	
	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
	@Autowired
	private AditionalServiceService aditionalServiceService;
	
//	@RequestMapping("/")
//	public String index(Model model) {
//		model.addAttribute("citys", cityService.findAll());
//		return "user-index";
//
//	}

	@RequestMapping("/city/{id}")
	public String category(@PathVariable Long id, Model model) {
		model.addAttribute("city", cityService.findOne(id));
		model.addAttribute("hotelNames", hotelNameService.findByCityId(id));
		return "user-city";
	}

	@RequestMapping("/hotelName/{id}")
	public String hotelInCity(@PathVariable Long id, Model model) {
		model.addAttribute("hotelName", hotelNameService.findOne(id));
		model.addAttribute("roomServices", roomServiceService.findByHotelNameId(id));
		model.addAttribute("aditionalServices", aditionalServiceService.findByHotelNameId(id));
		return "user-hotelName";
	}
	
	@RequestMapping("/roomService/{id}")
	public String roomsInHotel(@PathVariable Long id, Model model) {
		model.addAttribute("roomServices", roomServiceService.findOne(id));
		model.addAttribute("typeOfBathRooms", typeOfBathRoomService.findOne(id));
		model.addAttribute("typeOfRooms", typeOfRoomService.findOne(id));
		return "user-roomService";
	}
	
	@RequestMapping("/conn")
	public String conn() {
		return "user-conn";
	}

	@RequestMapping("/gogo")
	public String gogo() {
		return "user-gogo";
	}

	@RequestMapping("/dos")
	public String dos() {
		return "user-dos";
	}

	@RequestMapping("/index")
	public String dosgoto() {
		return "user-index";
	}

	@RequestMapping("/link")
	public String link() {
		return "user-link";
	}

	@RequestMapping("/end")
	public String end() {
		return "user-end";
	}

}
