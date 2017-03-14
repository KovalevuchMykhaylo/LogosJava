package ua.com.hotel.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
@Entity
@Table(name = "rent", indexes = @Index(columnList = "first, second"))
public class RentDate extends AbstractEntity{
	@Column
	private LocalDate first;
	@Column
	private LocalDate second;

	public RentDate() {
	}

	public LocalDate getFirst() {
		return first;
	}

	public void setFirst(LocalDate first) {
		this.first = first;
	}

	public LocalDate getSecond() {
		return second;
	}

	public void setSecond(LocalDate second) {
		this.second = second;
	}


}
