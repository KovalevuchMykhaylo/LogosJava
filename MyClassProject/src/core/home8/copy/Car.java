package core.home8.copy;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import core.home8.copy.Body; 
import core.home8.copy.SteeringWheel; 
import core.home8.copy.Wheel; 
import core.home8.copy.Car.*; 

import java.util.List;

import core.home61.Univercity;
import static core.home8.copy.Body.*;
import static core.home8.copy.Car.*;
import static core.home8.copy.Wheel.*;
import static core.home8.copy.SteeringWheel.*;

public class Car {
	
	private String vendor;
	
	private Body body;
			
	private SteeringWheel steeringWheel;
	
	private Wheel wheel;

	public Car(String vendor, Body body, SteeringWheel steeringWheel,
			Wheel wheel) {
		super();
		this.vendor = vendor;
		this.body = body;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [vendor=" + vendor + ", body=" + body + ", steeringWheel="
				+ steeringWheel + ", wheel=" + wheel + "]";
	}

	
}