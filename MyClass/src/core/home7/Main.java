package core.home7; 
import java.util.ArrayList; 
import java.util.Collection; 
import java.util.List; 
import java.util.Scanner; 

import core.home7.Body; 
import core.home7.SteeringWheel; 
import core.home7.Wheel; 
import core.home7.Car.*; 


public class Main { 

public static void main(String[] args) { 
	

//Car car1 = new Car("Ferrari", new Body("Red"), new SteeringWheel(16), new Wheel(16, 4)); 
//Car car2 = new Car("BMW", new Body("Red"), new SteeringWheel(16), new Wheel(16, 4)); 
//Car car3 = new Car("Ford", new Body("Red"), new SteeringWheel(16), new Wheel(16, 5)); 
//Car car4 = new Car("BMW", new Body("Black"), new SteeringWheel(16), new Wheel(15, 4)); 
//Car car5 = new Car("Ford", new Body("Black"), new SteeringWheel(16), new Wheel(15, 4)); 
//Car car6 = new Car("Ferrari", new Body("Black"), new SteeringWheel(15), new Wheel(15 ,4)); 
//Car car7 = new Car("BMW", new Body("Green"), new SteeringWheel(15), new Wheel(15 ,5)); 
//Car car8 = new Car("Ford", new Body("Green"), new SteeringWheel(15), new Wheel(17 ,5)); 
//
//List<Car> list = new ArrayList<>(); 
//list.add(car1); 
//list.add(car2); 
//list.add(car3); 
//list.add(car4); 
//list.add(car5); 
//list.add(car6); 
//list.add(car7); 
//list.add(car8); 


//list.forEach(System.out::println); 
//list.contains(Car.containsVendor.equals==BMW);
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 to show other colors");
System.out.println("Enter 2 to show color and streeingwheel");
System.out.println("Enter 3 have everising");
System.out.println("Enter 4 if streeingwheel have buttons diametr of wheels x2");
System.out.println("Enter 5 to show Wheels with diametr and low");
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