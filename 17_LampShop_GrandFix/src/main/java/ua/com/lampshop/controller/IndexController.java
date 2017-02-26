package ua.com.lampshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.lampshop.service.CategoryService;
import ua.com.lampshop.service.ItemService;
import ua.com.lampshop.service.PlinthTypeService;
import ua.com.lampshop.service.VendorRegionService;
import ua.com.lampshop.service.VendorService;

@Controller
public class IndexController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ItemService itemService;

	@Autowired
	private PlinthTypeService plinthTypeService;
	
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private VendorRegionService vendorRegionService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("categorys", categoryService.findAll());
		model.addAttribute("plinthTypes", plinthTypeService.findAll());
		model.addAttribute("vendorRegions", vendorRegionService.findAll());
		return "user-index";
	}

	@RequestMapping("/category/{id}")
	public String category(@PathVariable Long id, Model model) {
		model.addAttribute("category", categoryService.findOne(id));
		model.addAttribute("items", itemService.findByCategoryId(id));
		return "user-category";
	}

	@RequestMapping("/plinthType/{id}")
	public String plinthType(@PathVariable Long id, Model model) {
		model.addAttribute("plinthType", plinthTypeService.findOne(id));
		model.addAttribute("items", itemService.findByPlinthTypeId(id));
		return "user-plinthType";
	}

	@RequestMapping("/vendorRegion/{id}")
	public String vendorRegion(@PathVariable Long id, Model model) {
		model.addAttribute("vendorRegion", vendorRegionService.findOne(id));
		model.addAttribute("vendors", vendorService.findByVendorRegionId(id));
		return "user-vendorRegion";
	}

	@RequestMapping("/conn")
	public String conn() {
		return "user-conn";
	}

	@RequestMapping("/gogo")
	public String gogo() {
		return "user-gogo";
	}

	@RequestMapping("/dos")
	public String dos() {
		return "user-dos";
	}

	@RequestMapping("/index")
	public String dosgoto() {
		return "user-index";
	}

	@RequestMapping("/link")
	public String link() {
		return "user-link";
	}

	@RequestMapping("/end")
	public String end() {
		return "user-end";
	}
}
