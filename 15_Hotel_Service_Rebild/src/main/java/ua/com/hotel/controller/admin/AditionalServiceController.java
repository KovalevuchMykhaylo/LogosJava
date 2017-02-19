package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.service.AditionalServiceService;

@Controller
@RequestMapping("/admin/aditionalService")
public class AditionalServiceController {

	@Autowired
	private AditionalServiceService aditionalServiceService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("aditionalServices", aditionalServiceService.findAll());
		return "admin-aditionalService";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		aditionalServiceService.delete(id);
		return "redirect:/admin/aditionalService";
	}
	@PostMapping
	public String save(@RequestParam String type){
		AditionalService aditionalService = new AditionalService();
		aditionalService.setType(type);
		aditionalServiceService.save(aditionalService);
		return "redirect:/admin/aditionalService";
	}
}