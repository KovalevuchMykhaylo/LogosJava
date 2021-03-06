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

import ua.com.hotel.dto.form.RoomServiceForm;
import ua.com.hotel.editor.HotelNameEditor;
import ua.com.hotel.editor.TypeOfBathRoomEditor;
import ua.com.hotel.editor.TypeOfRoomEditor;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.RoomServiceService;
import ua.com.hotel.service.TypeOfBathRoomService;
import ua.com.hotel.service.TypeOfRoomService;
import ua.com.hotel.validator.RoomServiceValidator;

@Controller
@RequestMapping("/admin/roomService")
@SessionAttributes("roomService")
public class RoomServiceController {

	@Autowired
	private RoomServiceService roomServiceService;
	
	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private TypeOfBathRoomService typeOfBathRoomService;
	
	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
	@InitBinder("roomService")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(HotelName.class, new HotelNameEditor(hotelNameService));
		binder.registerCustomEditor(TypeOfRoom.class, new TypeOfRoomEditor(typeOfRoomService));
		binder.registerCustomEditor(TypeOfBathRoom.class, new TypeOfBathRoomEditor(typeOfBathRoomService));
		binder.setValidator(new RoomServiceValidator(roomServiceService));
	}
	
	@ModelAttribute("roomService")
	public RoomServiceForm getForm(){
		return new RoomServiceForm();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("roomServices", roomServiceService.findAll());
		model.addAttribute("hotelNames", hotelNameService.findAll());
		model.addAttribute("typeOfRooms", typeOfRoomService.findAll());
		model.addAttribute("typeOfBathRooms", typeOfBathRoomService.findAll());
		return "admin-roomService";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id){
		roomServiceService.delete(id);
		return "redirect:/admin/roomService";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model){
		model.addAttribute("roomService", roomServiceService.finForm(id));
		return show(model);
	}
	
	@RequestMapping("/cancel")
	public String cancel(SessionStatus status){
		status.setComplete();
		return "redirect:/admin/roomService";
	}
	
	@PostMapping
	public String save(@ModelAttribute ("roomService") @Valid RoomServiceForm roomServiceForm, BindingResult br, Model model, SessionStatus status) {
		if(br.hasErrors())return show(model);
		roomServiceService.save(roomServiceForm);
		status.setComplete();
		return "redirect:/admin/roomService";
	}
}
