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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.hotel.entity.User;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.UserService;
import ua.com.hotel.validator.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private CityService cityService;
	
	@InitBinder("user")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new UserValidator(userService));
	}
//	@RequestMapping
//	public String show(Model model){
//		model.addAttribute("users", userService.findAll());
//		return "admin-user";
//	}
	
	@RequestMapping("/")
	public String index(Principal principal, Model model){
		model.addAttribute("citys", cityService.findAll());
		if(principal!=null){
			System.out.println(principal.getName());
		}
		return "user-index";
	}
	
	@PostMapping("/registration")
	public String save(@ModelAttribute("user") @Valid User user, BindingResult br){
		if(br.hasErrors())return "user-registration";
		userService.save(user);
		return "redirect:/login";
	}
	@GetMapping("/registration")
	public String registration(Model model){
		model.addAttribute("user", new User());
		return "user-registration";
	}
	
	@GetMapping("/login")
	public String login(){
		return "user-login";
	}
	
	@RequestMapping("/cancel")
	public String cancel(){
		return "redirect:/registration";
	}

}
