package ua.com.hotel.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.hotel.entity.AditionalService;
import ua.com.hotel.entity.City;
import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.entity.TypeOfRoom;
import ua.com.hotel.service.AditionalServiceService;
import ua.com.hotel.service.CityService;
import ua.com.hotel.service.HotelNameService;
import ua.com.hotel.service.TypeOfBathRoomService;
import ua.com.hotel.service.TypeOfRoomService;
import ua.com.hotel.serviceImp.AditionalServiceServiceImp;
import ua.com.hotel.serviceImp.CityServiceImp;
import ua.com.hotel.serviceImp.HotelNameServiceImp;
import ua.com.hotel.serviceImp.TypeOfBathRoomServiceImp;
import ua.com.hotel.serviceImp.TypeOfRoomServiceImp;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
		
		AditionalServiceService aditionalServiceService =(AditionalServiceService)
				context.getBean(AditionalServiceServiceImp.class);

//		aditionalServiceService.save(new AditionalService("Pool"));
//		System.out.println(aditionalServiceService.findAll());
//		System.out.println(aditionalServiceService.findOne(2));
//		aditionalServiceService.delete(2);
		
//		HotelNameService hotelNameService = context.getBean(HotelNameServiceImp.class);
//		hotelNameService.save(new HotelName("Hell"));
//		
//		CityService cityService = context.getBean(CityServiceImp.class);
//		cityService.save(new City("Sion"));
//		
//		TypeOfBathRoomService typeOfBathRoomService = (TypeOfBathRoomService) context.getBean(TypeOfBathRoomServiceImp.class);
//		typeOfBathRoomService.save(new TypeOfBathRoom("Window"));
//		
//		TypeOfRoomService typeOfRoomService = (TypeOfRoomService) context.getBean(TypeOfRoomServiceImp.class);
//		typeOfRoomService.save(new TypeOfRoom("Fof just meried"));
		
		context.close();
	}

}
