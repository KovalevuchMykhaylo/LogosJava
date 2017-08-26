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
import ua.com.lampshop.editor.VendorRegionEditor;
import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.entity.VendorRegion;
import ua.com.lampshop.service.VendorRegionService;
import ua.com.lampshop.service.VendorService;

@Controller
@RequestMapping("/admin/vendor")
@SessionAttributes("vendor")
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private VendorRegionService vengorRegionService;
	
	@InitBinder("vendor")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(VendorRegion.class, new VendorRegionEditor(vengorRegionService));
		binder.registerCustomEditor(Vendor.class, new VendorEditor(vendorService));
	}
	
	@ModelAttribute("vendor")
	public Vendor getForm(){
		return new Vendor();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("vendors", vendorService.findAll());
		model.addAttribute("vendorRegions", vengorRegionService.findAll());
		return "admin-vendor";
		
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		vendorService.delete(id);
		return "redirect:/admin/vendor";
	}
	@RequestMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
		model.addAttribute("vendor", vendorService.findOne(id));
		return show(model);
	}
	@PostMapping
	public String save(@ModelAttribute("vendor") Vendor vendor, SessionStatus sessionStatus){
		vendorService.save(vendor);
		sessionStatus.setComplete();
		return "redirect:/admin/vendor";
	}
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/vendor";
	}

}