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

import ua.com.lampshop.editor.CategoryEditor;
import ua.com.lampshop.editor.VendorEditor;
import ua.com.lampshop.entity.Category;
import ua.com.lampshop.entity.CountryProducer;
import ua.com.lampshop.entity.PlinthType;
import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.CategoryService;
import ua.com.lampshop.service.PlinthTypeService;
import ua.com.lampshop.service.VendorService;

@Controller
@RequestMapping("/admin/plinthType")
@SessionAttributes("plinthType")
public class PlinthTypeController {

	@Autowired
	private PlinthTypeService plinthTypeService;
	
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private CategoryService categoryService;
	
	@InitBinder("plinthType")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(Vendor.class, new VendorEditor(vendorService));
		binder.registerCustomEditor(Category.class, new CategoryEditor(categoryService));
	}
	
	@ModelAttribute("plinthType")
	public PlinthType getForm(){
		return new PlinthType();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("plinthTypes", plinthTypeService.findAll());
		model.addAttribute("vendors", vendorService.findAll());
		model.addAttribute("categorys", categoryService.findAll());
		return "admin-plinthType";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		plinthTypeService.delete(id);
		return "redirect:/admin/plinthType";
	}
	@PostMapping
	public String save(@ModelAttribute("plinthType") PlinthType plinthType){
		plinthTypeService.save(plinthType);
		return "redirect:/admin/plinthType";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
		model.addAttribute("plinthType", plinthTypeService.findOne(id));
		return show(model);
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/plinthType";
	}
}
