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

public class Four {
		
		public static void cars4() {
		
			Car car1 = new Car("Ferrari", new Body("Red","Alu", "Hatchback"), new SteeringWheel(16, false), new Wheel(16, 4, "Winter")); 
			Car car2 = new Car("BMW", new Body("Red", "Metall", "Touring"), new SteeringWheel(16, false), new Wheel(16, 4, "Winter")); 
			Car car3 = new Car("Ford", new Body("Red", "Carbon", "Compartment"), new SteeringWheel(16, false), new Wheel(16, 5, "Winter")); 
			Car car4 = new Car("BMW", new Body("Black", "Metall", "Touring"), new SteeringWheel(16, false), new Wheel(15, 4, "Summer")); 
			Car car5 = new Car("Ford", new Body("Black", "Carbon", "Compartment"), new SteeringWheel(16, true), new Wheel(15, 4, "Summer")); 
			Car car6 = new Car("Ferrari", new Body("Black","Alu", "Hatchback"), new SteeringWheel(15, true), new Wheel(15 ,4, "Summer")); 
			Car car7 = new Car("BMW", new Body("Green", "Metall", "Touring"), new SteeringWheel(15, true), new Wheel(15 ,5, "Summer")); 
			Car car8 = new Car("Ford", new Body("Green", "Carbon", "Compartment"), new SteeringWheel(15, true), new Wheel(17 ,5, "Summer")); 
			
			Car def = new Car("Drof", new Body("Blue","Afamantine", "IronHorse"), new SteeringWheel(99, true), new Wheel(35 ,12, "Summer"));
			
			List<Car> list = new ArrayList<>(); 
			
			list.add(car1); 
			list.add(car2); 
			list.add(car3); 
			list.add(car4); 
			list.add(car5); 
			list.add(car6); 
			list.add(car7); 
			list.add(car8); 

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter body type");
			String type = sc.next();
			System.out.println("Enter min wheel diametr");
			int min = sc.nextInt();
			System.out.println("Enter max wheel diametr");
			int max = sc.nextInt();
			Iterator<Car> iter = list.iterator();
			while (iter.hasNext()) {
				Car car = iter.next();
				if(car.getWheel().getDiameter()>=min&&car.getWheel().getDiameter()<=max&&car.getBody().getType().equals(type)){
					iter.remove();
				}
			}
			list.forEach(System.out::println);
	}

}
