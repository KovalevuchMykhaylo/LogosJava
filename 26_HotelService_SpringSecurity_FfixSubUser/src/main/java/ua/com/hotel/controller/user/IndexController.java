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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.hotel.dto.filter.UserFilter;
import ua.com.hotel.editor.HotelNameEditor;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.User;
import ua.com.hotel.service.AditionalServiceService;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.RentDateService;
import ua.com.hotel.service.RoomServiceService;
import ua.com.hotel.service.TypeOfBathRoomService;
import ua.com.hotel.service.TypeOfRoomService;
import ua.com.hotel.service.UserService;
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

	@Autowired
	private UserService userService;
	
	@Autowired
	private RentDateService rentDateService;

	@RequestMapping("/")
	public String index(Principal principal, Model model){
		model.addAttribute("users", userService.findAll());
		model.addAttribute("HotelNames", hotelNameService.findAll());
		model.addAttribute("citys", cityService.findAll());
		if(principal!=null){
			System.out.println(principal.getName());
		}
		return "user-index";
	}
	
	@InitBinder("user")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new UserValidator(userService));
		binder.registerCustomEditor(HotelName.class, new HotelNameEditor(hotelNameService));
	}

	@RequestMapping("/city/{id}")
	public String category(@PathVariable Long id, Model model) {
		model.addAttribute("city", cityService.findOne(id));
		model.addAttribute("hotelNames", hotelNameService.findByCityId(id));
		return "user-city";
	}

	@RequestMapping("/hotelName/{id}")
	public String hotelInCity(@PathVariable Long id, Model model) {
		model.addAttribute("hotelName", hotelNameService.findOne(id));
		model.addAttribute("roomServices",
				roomServiceService.findByHotelNameId(id));
		model.addAttribute("aditionalServices",
				aditionalServiceService.findByHotelNameId(id));
		return "user-hotelName";
	}

	@RequestMapping("/roomService/{id}")
	public String roomsInHotel(@PathVariable Long id, Model model) {
		model.addAttribute("roomServices", roomServiceService.findOne(id));
		model.addAttribute("typeOfBathRooms", typeOfBathRoomService.findOne(id));
		model.addAttribute("typeOfRooms", typeOfRoomService.findOne(id));
		return "user-roomService";
	}

	@PostMapping("/registration")
	public String save(@Valid User user, BindingResult br) {
		if (br.hasErrors())return "user-registration";
		userService.save(user);
		return "redirect:/login";
	}

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("user", new User());
		return "user-registration";
	}

	@PostMapping("/registrationSub")
	public String saveSubUser(User user, BindingResult br) {
		userService.saveSubUser(user);
		return "redirect:/login";
	}

	@GetMapping("/registrationSub")
	public String registrationSubUser(Model model) {
		model.addAttribute("hotelNames", hotelNameService.findAll());
		model.addAttribute("user", new User());
		return "user-registrationSub";
	}

	@GetMapping("/login")
	public String login() {
		return "user-login";
	}

	@RequestMapping("/myProfile/{id}")
	public String myProfile(@PathVariable Long id, Model model, UserFilter userFilter) {
		model.addAttribute("user", userService.findOne(id));
		model.addAttribute("rentDates", rentDateService.findAllByUser());
//		model.addAttribute("roomServices", roomServiceService.findAllByUser());
		return "user-myProfile";
	}
	
	@RequestMapping("/cancel")
	public String cancel() {
		return "redirect:/registration";
	}
	
	@RequestMapping("/cancelsub")
	public String cancelsub() {
		return "redirect:/registrationSub";
	}
	
//	@PostMapping
//	public String save(@Valid RentDateForm rentDateForm, BindingResult br, Model model){
//		if(br.hasErrors()) return "user-roomService";
//		rentDateService.save(rentDateForm);
//		return "redirect:/roomService";
//	}
//	@GetMapping("/rentDate")
//	public String rentDateUser(Model model) {
//		model.addAttribute("rentDate", new RentDateForm());
//		return "user-roomService";
//	}

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