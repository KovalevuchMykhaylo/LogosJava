package ua.com.lampshop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.lampshop.entity.VendorRegion;
import ua.com.lampshop.service.VendorRegionService;

@Controller
@RequestMapping("/admin/vendorRegion")
@SessionAttributes("vendorRegion")
public class VendorRegionController {

	@Autowired
	private VendorRegionService vendorRegionService;

	@ModelAttribute("vendorRegion")
	public VendorRegion getForm() {
		return new VendorRegion();
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("vendorRegions", vendorRegionService.findAll());
		return "admin-vendorRegion";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("vendorRegion", vendorRegionService.findOne(id));
		return show(model);
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		vendorRegionService.delete(id);
		return "redirect:/admin/vendorRegion";
	}

	@PostMapping
	public String save(
			@ModelAttribute("vendorRegion") VendorRegion vendorRegion) {
		vendorRegionService.save(vendorRegion);
		return "redirect:/admin/vendorRegion";
	}
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/vendorRegion";
	}
}
