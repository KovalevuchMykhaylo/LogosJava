package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.service.AditionalServiceService;
import ua.com.hotel.service.HotelNameService;

@Controller
@RequestMapping("/admin/aditionalService")
public class AditionalServiceController {

	@Autowired
	private AditionalServiceService aditionalServiceService;
	
	@Autowired
	private HotelNameService hotelNameService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("aditionalServices", aditionalServiceService.findAll());
		model.addAttribute("hotelNames", hotelNameService.findAll());
		return "admin-aditionalService";
	}
	
	@GetMapping("/update/{id}")
	public String update (@PathVariable Long id, Model model){
		model.addAttribute("aditionalService", aditionalServiceService.findOne(id));
		return show(model);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		aditionalServiceService.delete(id);
		return "redirect:/admin/aditionalService";
	}
	
	@PostMapping
	public String save(@RequestParam String type, @RequestParam Long hotelNameId) {
		AditionalService aditionalService = new AditionalService();
		HotelName hotelName = hotelNameService.findOne(hotelNameId);
		aditionalService.setType(type);
		aditionalService.setHotelName(hotelName);
		aditionalServiceService.save(aditionalService);
		return "redirect:/admin/aditionalService";
	}
}
