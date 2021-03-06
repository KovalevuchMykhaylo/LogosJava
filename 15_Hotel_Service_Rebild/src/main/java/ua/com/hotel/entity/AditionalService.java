package ua.com.hotel.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Тип додаткового сервісу в готелі, якщо такий присутній
@Entity
@Table(name = "aditional_service")
public class AditionalService extends AbstractEntity{
	@Column
	private String type;
	@ManyToOne (fetch = FetchType.LAZY)
	private HotelName hotelName;
	public AditionalService(String type, HotelName hotelName) {
		super();
		this.type = type;
		this.hotelName = hotelName;
	}
	public AditionalService(String type) {
		super();
		this.type = type;
	}
	public AditionalService() {
		super();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HotelName getHotelName() {
		return hotelName;
	}
	public void setHotelName(HotelName hotelName) {
		this.hotelName = hotelName;
	}

}