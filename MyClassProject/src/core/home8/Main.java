package core.home8; 
import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List; 
import java.util.Scanner; 

public class Main { 
	
	private final static List<Car> list = new ArrayList<>(); 
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) { 
		
		Car car1 = new Car("Ferrari", new Body("Red","Alu", "Hatchback"), new SteeringWheel(16, false), new Wheel(16, 4, "Winter")); 
		Car car2 = new Car("BMW", new Body("Red", "Metall", "Touring"), new SteeringWheel(16, false), new Wheel(16, 4, "Winter")); 
		Car car3 = new Car("Ford", new Body("Red", "Carbon", "Compartment"), new SteeringWheel(16, false), new Wheel(16, 5, "Winter")); 
		Car car4 = new Car("BMW", new Body("Black", "Metall", "Touring"), new SteeringWheel(16, false), new Wheel(15, 4, "Summer")); 
		Car car5 = new Car("Ford", new Body("Black", "Carbon", "Compartment"), new SteeringWheel(16, true), new Wheel(15, 4, "Summer")); 
		Car car6 = new Car("Ferrari", new Body("Black","Alu", "Hatchback"), new SteeringWheel(15, true), new Wheel(15 ,4, "Summer")); 
		Car car7 = new Car("BMW", new Body("Green", "Metall", "Touring"), new SteeringWheel(15, true), new Wheel(15 ,5, "Summer")); 
		Car car8 = new Car("Ford", new Body("Green", "Carbon", "Compartment"), new SteeringWheel(15, true), new Wheel(17 ,5, "Summer")); 
		
			list.add(car1); 
			list.add(car2); 
			list.add(car3); 
			list.add(car4); 
			list.add(car5); 
			list.add(car6); 
			list.add(car7); 
			list.add(car8); 
			
			while(true){
				System.out.println("Enter 1 to find type of body");
				System.out.println("Enter 2 to delete car with color");
				System.out.println("Enter 3 to change tires");
				System.out.println("Enter 4 to delete all car with body type and diametr");
				System.out.println("Enter 5 to print index of car with this body type");
					switch (sc.next()) {
						case "1":
							cars1();
						
						break;
						case "2":
							cars2();
						
							break;
						case "3":
							cars3();
						
							break;
						case "4":
							cars4();
						
							break;
						case "5":
							cars5();
						
							break;
						default:
							sc.close();
							return;
					}
			}
	}
					
	static void cars1(){
		System.out.println("Enter type of body");
		String j = sc.next();
		Iterator<Car> iter = list.iterator();
		if(!list.isEmpty()){
		while (iter.hasNext()) {
			Car car = iter.next();
			if(car.getBody().getType().contains(j)){
				System.out.println(car);
			}
		}
		}
	}
	
	static void cars2(){
		System.out.println("Enter color to remuve cars");
		String col = sc.next();
		Iterator<Car> iter = list.iterator();
		if(!list.isEmpty()){
		while (iter.hasNext()) {
			Car car = iter.next();
			if(car.getBody().getColor().equals(col)){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
		}
	}
	
	static void cars3(){
		System.out.println("Enter nim diametr to change tiets");
		int min = sc.nextInt();
		System.out.println("Enter max diametr to change tiets");
		int max = sc.nextInt();
		Iterator<Car> iter = list.iterator();
		if(!list.isEmpty()){
		while (iter.hasNext()) {
			Car car = iter.next();
			if(car.getWheel().getDiameter()>=min&&car.getWheel().getDiameter()<=max){
				car.getWheel().setTires("Winter");
			}
		}
		list.forEach(System.out::println);
		}
	}
	
	static void cars4(){
		System.out.println("Enter body type");
		String type = sc.next();
		System.out.println("Enter min wheel diametr");
		int min = sc.nextInt();
		System.out.println("Enter max wheel diametr");
		int max = sc.nextInt();
		Iterator<Car> iter = list.iterator();
		if(!list.isEmpty()){
		while (iter.hasNext()) {
			Car car = iter.next();
			if(car.getWheel().getDiameter()>=min&&car.getWheel().getDiameter()<=max&&car.getBody().getType().equals(type)){
				iter.remove();
			}
		}
		list.forEach(System.out::println);
		}
	}
	
	static void cars5(){
		System.out.println("Enter type of body");
		String type = sc.next();
		Iterator<Car> iter = list.iterator();
		if(!list.isEmpty()){
		while (iter.hasNext()){
			Car car = iter.next();
			if(car.getBody().getType().equals(type)){
				System.out.println(list.indexOf(car)+1);
				}
			}
		}
	}
}