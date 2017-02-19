package ua.com.hotel.controller.admin;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.RoomService;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.RoomServiceService;
import ua.com.hotel.service.TypeOfBathRoomService;
import ua.com.hotel.service.TypeOfRoomService;

@Controller
@RequestMapping("/admin/roomService")
public class RoomServiceController {

	@Autowired
	private RoomServiceService roomServiceService;
	
	@Autowired
	private HotelNameService hotelNameService;
	
	@Autowired
	private TypeOfBathRoomService typeOfBathRoomService;
	
	@Autowired
	private TypeOfRoomService typeOfRoomService;
	
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
//	@PostMapping
//	public String save(@RequestParam BigDecimal price){
//		RoomService roomService = new RoomService();
//		roomService.setPrice(price);
//		roomServiceService.save(roomService);
//		return "redirect:/admin/roomService";
//	}
	@PostMapping
	public String save(@RequestParam Long hotelNameId, @RequestParam BigDecimal price, @RequestParam int roomNumber, @RequestParam int room,
			@RequestParam Long typeOfBathRoomId, @RequestParam Long typeOfRoomId) {
		HotelName hotelName = hotelNameService.findOne(hotelNameId);
		TypeOfBathRoom typeOfBathRoom = typeOfBathRoomService.findOne(typeOfBathRoomId);
		TypeOfRoom typeOfRoom = typeOfRoomService.findOne(typeOfRoomId);
		RoomService entity = new RoomService();
		entity.setHotelName(hotelName);
		entity.setRoomNumber(roomNumber);
		entity.setRoom(room);
		entity.setPrice(price);
		entity.setTypeOfBathRoom(typeOfBathRoom);
		entity.setTypeOfRoom(typeOfRoom);
		roomServiceService.save(entity);
		return "redirect:/admin/roomService";
	}
}
