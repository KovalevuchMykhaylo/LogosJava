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

import ua.com.lampshop.editor.MeasuringSystemEditor;
import ua.com.lampshop.editor.PlinthTypeEditor;
import ua.com.lampshop.editor.VendorEditor;
import ua.com.lampshop.entity.CountryProducer;
import ua.com.lampshop.entity.Item;
import ua.com.lampshop.entity.MeasuringSystem;
import ua.com.lampshop.entity.PlinthType;
import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.ItemService;
import ua.com.lampshop.service.MeasuringSystemService;
import ua.com.lampshop.service.PlinthTypeService;
import ua.com.lampshop.service.VendorService;

@Controller
@RequestMapping("/admin/item")
@SessionAttributes("item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@Autowired
	private PlinthTypeService plinthTypeService;

	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private MeasuringSystemService measuringSystemService;
	
	@InitBinder("item")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(PlinthType.class, new PlinthTypeEditor(plinthTypeService));
		binder.registerCustomEditor(Vendor.class, new VendorEditor(vendorService));
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
	}
	
	@ModelAttribute("item")
	public Item getForm(){
		return new Item();
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("items", itemService.findAll());
		model.addAttribute("plinthTypes", plinthTypeService.findAll());
		model.addAttribute("vendors", vendorService.findAll());
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		return "admin-item";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
		model.addAttribute("item", itemService.findOne(id));
		return show(model);
	}

	@PostMapping
	public String save(@ModelAttribute("item") Item item){
		itemService.save(item);
		return "redirect:/admin/item";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		itemService.delete(id);
		return "redirect:/admin/item";
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/item";
	}

}