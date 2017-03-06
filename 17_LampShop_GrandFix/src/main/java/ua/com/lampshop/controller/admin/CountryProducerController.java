package ua.com.lampshop.controller.admin;

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

import ua.com.lampshop.editor.VendorEditor;
import ua.com.lampshop.entity.CountryProducer;
import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.CountryProducerService;
import ua.com.lampshop.service.VendorService;

@Controller
@RequestMapping("/admin/countryProducer")
@SessionAttributes("countryProducer")
public class CountryProducerController {

	@Autowired
	private CountryProducerService countryProducerService;
	
	@Autowired
	private VendorService vendorService;
	
	@ModelAttribute("countryProducer")
	public CountryProducer getForm(){
		return new CountryProducer();
	}
	
	@InitBinder("countryProducer")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(Vendor.class, new VendorEditor(vendorService));
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("countryProducers", countryProducerService.findAll());
		model.addAttribute("vendors", vendorService.findAll());
		return "admin-countryProducer";
	}
	
	@GetMapping("/update/{id}")
	public String update (@PathVariable Long id, Model model){
		model.addAttribute("countryProducer", countryProducerService.findOne(id));
		return show(model);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		countryProducerService.delete(id);
		return "redirect:/admin/countryProducer";
	}
	
	@PostMapping
	public String save(@ModelAttribute("countryProducer") CountryProducer countryProducer, SessionStatus status){
		countryProducerService.save(countryProducer);
		status.setComplete();
		return "redirect:/admin/countryProducer";
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/countryProducer";
	}
}
