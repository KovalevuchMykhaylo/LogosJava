package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.service.AditionalServiceService;

@Controller
@RequestMapping("/admin/aditionalService")
public class AditionalServiceController {

	@Autowired
	private AditionalServiceService aditionalServiceService;
	
	@ModelAttribute("aditionalService")
	public AditionalService getForm(){
		return new AditionalService();
	}
	
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
	public String save(@ModelAttribute("aditionalService") AditionalService aditionalService){
		aditionalServiceService.save(aditionalService);
		return "redirect:/admin/aditionalService";
	}
}