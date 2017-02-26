package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.hotel.editor.AditionalServiceEditor;
import ua.com.hotel.editor.CityEditor;
import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.entity.City;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.service.AditionalServiceService;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;

@Controller
@RequestMapping("/admin/hotelName")
@SessionAttributes("hotelName")
public class HotelNameController {

	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private AditionalServiceService aditionalServiceService;
	
	@InitBinder("hotelName")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(City.class, new CityEditor(cityService));
		binder.registerCustomEditor(AditionalService.class, new AditionalServiceEditor(aditionalServiceService));
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("hotelNames", hotelNameService.findAll());
		model.addAttribute("citys", cityService.findAll());
		model.addAttribute("aditionalServices", aditionalServiceService.findAll());
		return "admin-hotelName";
	}
	
	@ModelAttribute("hotelName")
	public HotelName getForm(){
		return new HotelName();
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		hotelNameService.delete(id);
		return "redirect:/admin/hotelName";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
		model.addAttribute("hotelName", hotelNameService.findOne(id));
		return show(model);
	}

	@PostMapping
	public String save(@ModelAttribute ("hotelName") HotelName hotelName) {
		hotelNameService.save(hotelName);
		return "redirect:/admin/hotelName";
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/hotelName";
	}
}
