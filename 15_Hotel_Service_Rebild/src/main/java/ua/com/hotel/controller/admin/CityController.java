package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.City;
import ua.com.hotel.service.CityService;


@Controller
@RequestMapping("/admin/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("citys", cityService.findAll());
		return "admin-city";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		cityService.delete(id);
		return "redirect:/admin/city";
	}
	@PostMapping
	public String save(@RequestParam String name){
		City city = new City();
		city.setName(name);
		cityService.save(city);
		return "redirect:/admin/city";
	}
}

