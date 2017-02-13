package ua.com.hotel.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(){
		return "user-index";
	}
	@RequestMapping("/conn")
	public String conn(){
		return "user-conn";
	}
	@RequestMapping("/gogo")
	public String gogo(){
		return "user-gogo";
	}
}
