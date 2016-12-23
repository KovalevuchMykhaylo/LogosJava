package core.home8.copy; 
import java.util.ArrayList; 
import java.util.Collection; 
import java.util.List; 
import java.util.Scanner; 

import core.home8.Body; 
import core.home8.SteeringWheel; 
import core.home8.Wheel; 
import core.home8.Car.*;


public class Main { 

	public static void main(String[] args) { 

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 to find type of body");
	System.out.println("Enter 2 to delete car with color");
	System.out.println("Enter 3 to change tires");
	System.out.println("Enter 4 to delete all car with body type and diametr");
	System.out.println("Enter 5 to print index of cfr with this body type");
	switch (sc.next()) {
		case "1":
			One.cars1();
		
		break;
		case "2":
			Two.cars2();
		
			break;
		case "3":
			Three.cars3();
		
			break;
		case "4":
			Four.cars4();
		
			break;
		case "5":
			Five.cars5();
		
			break;
		}
	}
}