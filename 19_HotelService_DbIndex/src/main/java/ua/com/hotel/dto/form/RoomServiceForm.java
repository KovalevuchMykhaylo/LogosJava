package ua.com.hotel.dto.form;

import ua.com.hotel.entity.HotelName;
import ua.com.hotel.entity.TypeOfBathRoom;
import ua.com.hotel.entity.TypeOfRoom;

public class RoomServiceForm {
	
	private Long id;
	
	private String roomNumber;
	
	private String room;
	
	private String price;
	
	private HotelName hotelName;
	
	private TypeOfBathRoom typeOfBathRoom;
	
	private TypeOfRoom typeOfRoom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public HotelName getHotelName() {
		return hotelName;
	}

	public void setHotelName(HotelName hotelName) {
		this.hotelName = hotelName;
	}

	public TypeOfBathRoom getTypeOfBathRoom() {
		return typeOfBathRoom;
	}

	public void setTypeOfBathRoom(TypeOfBathRoom typeOfBathRoom) {
		this.typeOfBathRoom = typeOfBathRoom;
	}

	public TypeOfRoom getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(TypeOfRoom typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
}