package ua.com.hotel.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.TypeOfRoomService;

@Controller
@RequestMapping("/admin/typeOfRoom")
public class TypeOfRoomController {

	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("typeOfRooms", typeOfRoomService.findAll());
		return "admin-typeOfRoom";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		typeOfRoomService.delete(id);
		return "redirect:/admin/typeOfRoom";
	}
	@PostMapping
	public String save(@RequestParam String type){
		TypeOfRoom typeOfRoom = new TypeOfRoom();
		typeOfRoom.setType(type);
		typeOfRoomService.save(typeOfRoom);
		return "redirect:/admin/typeOfRoom";
	}
}
