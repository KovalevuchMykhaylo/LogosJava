package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.service.TypeOfBathRoomService;

@Controller
@RequestMapping("/admin/typeOfBathRoom")
public class TypeOfBathRoomController {

	@Autowired
	private TypeOfBathRoomService typeOfBathRoomService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("typeOfBathRooms", typeOfBathRoomService.findAll());
		return "admin-typeOfBathRoom";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		typeOfBathRoomService.delete(id);
		return "redirect:/admin/typeOfBathRoom";
	}
	@PostMapping
	public String save(@RequestParam String type){
		TypeOfBathRoom typeOfBathRoom = new TypeOfBathRoom();
		typeOfBathRoom.setType(type);
		typeOfBathRoomService.save(typeOfBathRoom);
		return "redirect:/admin/typeOfBathRoom";
	}
}
