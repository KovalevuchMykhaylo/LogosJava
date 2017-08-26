package ua.com.hotel.controller.user;

import static ua.com.hotel.util.ParamBuilder.getParams;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.hotel.dto.form.RentDateForm;
import ua.com.hotel.editor.HotelNameEditor;
import ua.com.hotel.editor.RoomServiceEditor;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.RentDate;
import ua.com.hotel.entity.RoomService;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.RentDateService;
import ua.com.hotel.service.RoomServiceService;
import ua.com.hotel.validator.RentDateValidator;

@Controller
@RequestMapping("/rentDate")
@SessionAttributes("rentDate")
public class UserRentDateController {

	@Autowired
	private RentDateService rentDateService;
	
	@Autowired
	private RoomServiceService roomServiceService;
	
	@Autowired
	private HotelNameService hotelNameService;
	
	@ModelAttribute("rentDate")
	public RentDateForm getForm(){
		return new RentDateForm();
	}
	
	@RequestMapping
	public String show(Model model, @PageableDefault Pageable pageable){
		model.addAttribute("page", rentDateService.findAll());
		model.addAttribute("roomService", roomServiceService.findAll());
//		model.addAttribute("roomService", roomServiceService.finForm(id));
		return "admin-rentDate";
	}
	@InitBinder("rentDate")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new RentDateValidator(rentDateService));
//		binder.registerCustomEditor(RoomService.class, new RoomServiceEditor(roomServiceService));
		binder.registerCustomEditor(HotelName.class, new HotelNameEditor(hotelNameService));
	}
	
	@GetMapping("/update/{id}")
	public String update (@PathVariable Long id, Model model, @PageableDefault Pageable pageable){
		model.addAttribute("rentDate", rentDateService.finForm(id));
		return show(model, pageable);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id, @PageableDefault Pageable pageable){
		rentDateService.delete(id);
		return "redirect:/admin/rentDate"+getParams(pageable);
	}
	@PostMapping
	public String save(@ModelAttribute ("rentDate") @Valid RentDateForm rentDateForm, BindingResult br, Model model, SessionStatus status, @PageableDefault Pageable pageable, @Param("id") Long id){
		if(br.hasErrors()) return show(model, pageable);
		rentDateService.save(rentDateForm);
		status.setComplete();
		return "redirect:/roomService/{id}";
//		+getParams(pageable);
	}
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/roomService{id}";
	}
}
