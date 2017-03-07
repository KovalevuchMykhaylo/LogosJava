package ua.com.hotel.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.hotel.editor.CityEditor;
import ua.com.hotel.entity.City;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.validator.HotelNameValidator;

@Controller
@RequestMapping("/admin/hotelName")
@SessionAttributes("hotelName")
public class HotelNameController {

	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private CityService cityService;
	
	@InitBinder("hotelName")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(City.class, new CityEditor(cityService));
		binder.setValidator(new HotelNameValidator(hotelNameService));
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("hotelNames", hotelNameService.findAll());
		model.addAttribute("citys", cityService.findAll());
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
	public String save(@ModelAttribute ("hotelName") @Valid HotelName hotelName, BindingResult br, Model model, SessionStatus status) {
		if(br.hasErrors()) return show(model);
		hotelNameService.save(hotelName);
		status.setComplete();
		return "redirect:/admin/hotelName";
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/hotelName";
	}
}
