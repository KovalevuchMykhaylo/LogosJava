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
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.com.hotel.entity.User;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.UserService;
import ua.com.hotel.validator.UserValidator;

@Controller
//@RequestMapping("/admin/user")
@SessionAttributes("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private HotelNameService hotelNameService;
	
//	@ModelAttribute("userFrom")
//	public User getForm(){
//		return new User();
//	}
	
	@InitBinder("user")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new UserValidator(userService));
	}
	@RequestMapping("/admin/user")
	public String show(Model model){
		model.addAttribute("users", userService.findAll());
		model.addAttribute("HotelNames", hotelNameService.findAll());
		return "admin-user";
	}
	
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
	
	@PostMapping("/registration")
	public String save(@Valid User user, BindingResult br){
		if(br.hasErrors())return "user-registration";
		userService.save(user);
		return "redirect:/login";
	}
	@GetMapping("/registration")
	public String registration(Model model){
		model.addAttribute("user", new User());
		return "user-registration";
	}
	
	@PostMapping("/registrationSub")
	public String saveSubUser(User user){
		userService.saveSubUser(user);
		return "redirect:/login";
	}
	@GetMapping("/registrationSub")
	public String registrationSubUser(Model model){
		model.addAttribute("hotelNames", hotelNameService.findAll());
		model.addAttribute("user", new User());
		return "user-registrationSub";
	}
	
	@GetMapping("/login")
	public String login(){
		return "user-login";
	}
	
	@RequestMapping("/myProfile/{id}")
	public String myProfile(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.findOne(id));
		return "user-myProfile";
	}
	
	@RequestMapping("/cancel")
	public String cancel(){
		return "redirect:/registration";
	}
	@RequestMapping("admin/user/delete/{id}")
	public String delete(@PathVariable Long id){
		userService.delete(id);
		return "redirect:/admin/user";
	}

}
