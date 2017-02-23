package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.hotel.entity.City;
import ua.com.hotel.service.CityService;


@Controller
@RequestMapping("/admin/city")
@SessionAttributes("city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@ModelAttribute("city")
	public City getForm(){
		return new City();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("citys", cityService.findAll());
		return "admin-city";
	}
	
	@GetMapping("/update/{id}")
	public String update (@PathVariable Long id, Model model){
		model.addAttribute("city", cityService.findOne(id));
		return show(model);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		cityService.delete(id);
		return "redirect:/admin/city";
	}
	
	@PostMapping
	public String save(@ModelAttribute ("city") City city, SessionStatus status){
		cityService.save(city);
		status.setComplete();
		return "redirect:/admin/city";
	}
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/city";
	}
}

