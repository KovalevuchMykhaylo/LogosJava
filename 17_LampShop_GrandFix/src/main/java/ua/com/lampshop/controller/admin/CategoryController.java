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
import ua.com.lampshop.entity.Category;
import ua.com.lampshop.entity.Vendor;
import ua.com.lampshop.service.CategoryService;
import ua.com.lampshop.service.VendorService;

@Controller
@RequestMapping("/admin/category")
@SessionAttributes("category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private VendorService vendorService;
	
	@InitBinder("category")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(Vendor.class, new VendorEditor(vendorService));
	}
	
	@ModelAttribute("category")
	public Category getForm(){
		return new Category();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("categorys", categoryService.findAll());
		model.addAttribute("vendors", vendorService.findAll());
		return "admin-category";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		categoryService.delete(id);
		return "redirect:/admin/category";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
		model.addAttribute("category", categoryService.findAll());
		return show(model);
	}
	
	@PostMapping
	public String save(@ModelAttribute ("category") Category category){
		categoryService.save(category);
		return "redirect:/admin/category";
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/category";
	}
}