package ua.com.hotel.controller.admin;

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

import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.TypeOfRoomService;

@Controller
@RequestMapping("/admin/typeOfRoom")
@SessionAttributes("typeOfRoom")
public class TypeOfRoomController {

	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
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
	public String save(@ModelAttribute ("typeOfRoom") TypeOfRoom typeOfRoom, SessionStatus status){
		typeOfRoomService.save(typeOfRoom);
		status.setComplete();
		return "redirect:/admin/typeOfRoom";
	}
}
