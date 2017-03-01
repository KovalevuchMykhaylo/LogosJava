package ua.com.hotel.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.TypeOfRoomService;
import ua.com.hotel.validator.TypeOfRoomValidator;

@Controller
@RequestMapping("/admin/typeOfRoom")
@SessionAttributes("typeOfRoom")
public class TypeOfRoomController {

	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
	@InitBinder("typeOfRoom")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new TypeOfRoomValidator(typeOfRoomService));
	}
	
	@ModelAttribute("typeOfRoom")
	public TypeOfRoom getForm(){
	return new TypeOfRoom();
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/typeOfRoom";
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("typeOfRooms", typeOfRoomService.findAll());
		return "admin-typeOfRoom";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
	model.addAttribute("typeOfRoom", typeOfRoomService.findOne(id));
	return show(model);
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		typeOfRoomService.delete(id);
		return "redirect:/admin/typeOfRoom";
	}
	
	@PostMapping
	public String save(@ModelAttribute ("typeOfRoom") @Valid TypeOfRoom typeOfRoom, BindingResult br, Model model, SessionStatus status){
		if(br.hasErrors()) return show(model);
		typeOfRoomService.save(typeOfRoom);
		status.setComplete();
		return "redirect:/admin/typeOfRoom";
	}
}
