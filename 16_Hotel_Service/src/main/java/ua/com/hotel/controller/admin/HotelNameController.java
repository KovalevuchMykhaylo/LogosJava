package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.City;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.service.AditionalServiceService;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;

@Controller
@RequestMapping("/admin/hotelName")
public class HotelNameController {

	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private AditionalServiceService aditionalServiceService;
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("hotelNames", hotelNameService.findAll());
		model.addAttribute("citys", cityService.findAll());
		model.addAttribute("aditionalServices", aditionalServiceService.findAll());
		return "admin-hotelName";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		hotelNameService.delete(id);
		return "redirect:/admin/hotelName";
	}

	@PostMapping
	public String save(@RequestParam String name, @RequestParam Long cityId) {
		City city = cityService.findOne(cityId);
		HotelName hotelName = new HotelName();
		hotelName.setName(name);
		hotelName.setCity(city);
		hotelNameService.save(hotelName);
		return "redirect:/admin/hotelName";
	}
}
