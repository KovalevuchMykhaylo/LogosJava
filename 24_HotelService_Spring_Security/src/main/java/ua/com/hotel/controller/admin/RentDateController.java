package ua.com.hotel.controller.admin;

import static ua.com.hotel.util.ParamBuilder.getParams;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.service.RentDateService;
import ua.com.hotel.validator.RentDateValidator;

@Controller
@RequestMapping("/admin/rentDate")
@SessionAttributes("rentDate")
public class RentDateController {

	@Autowired
	private RentDateService rentDateService;
	
	@ModelAttribute("rentDate")
	public RentDate getForm(){
		return new RentDate();
	}
	
	@RequestMapping
	public String show(Model model, @PageableDefault Pageable pageable){
		model.addAttribute("page", rentDateService.findAll(pageable));
		return "admin-rentDate";
	}
	@InitBinder("rentDate")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new RentDateValidator(rentDateService));
	}
	
	@GetMapping("/update/{id}")
	public String update (@PathVariable Long id, Model model, @PageableDefault Pageable pageable){
		model.addAttribute("rentDate", rentDateService.findOne(id));
		return show(model, pageable);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id, @PageableDefault Pageable pageable){
		rentDateService.delete(id);
		return "redirect:/admin/rentDate"+getParams(pageable);
	}
	@PostMapping
	public String save(@ModelAttribute ("rentDate") @Valid RentDate rentDate, BindingResult br, Model model, SessionStatus status, @PageableDefault Pageable pageable){
		if(br.hasErrors()) return show(model, pageable);
		rentDateService.save(rentDate);
		status.setComplete();
		return "redirect:/admin/rentDate"+getParams(pageable);
	}
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/rentDate";
	}
}
