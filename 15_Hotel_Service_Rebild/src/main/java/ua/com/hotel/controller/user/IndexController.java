package ua.com.hotel.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;


@Controller
public class IndexController {
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private HotelNameService hotelNameService;

	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("citys", cityService.findAll());
		return "user-index";
	
	}
	@RequestMapping("/city/{id}")
	public String category(@PathVariable Long id, Model model){
		model.addAttribute("city", cityService.findOne(id));
		model.addAttribute("hotelNames", hotelNameService.findByCityId(id));
		return "user-city";
	}
	@RequestMapping("/conn")
	public String conn(){
		return "user-conn";
	}
	@RequestMapping("/gogo")
	public String gogo(){
		return "user-gogo";
	}
	@RequestMapping("/dos")
	public String dos(){
		return "user-dos";
	}
	@RequestMapping("/index")
	public String dosgoto(){
		return "user-index";
	}
	@RequestMapping("/link")
	public String link(){
		return "user-link";
	}
	@RequestMapping("/end")
	public String end(){
		return "user-end";
	}
	
}
