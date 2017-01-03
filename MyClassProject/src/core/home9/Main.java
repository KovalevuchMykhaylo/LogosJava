package core.home9; 
import java.util.ArrayList; 
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List; 
import java.util.Scanner; 

public class Main { 
	
	private final static LinkedHashSet <Car> Set = new LinkedHashSet<>(); 
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
		
			Set.add(car1); 
			Set.add(car2); 
			Set.add(car3); 
			Set.add(car4); 
			Set.add(car5); 
			Set.add(car6); 
			Set.add(car7); 
			Set.add(car8); 
			
			while(true){
				System.out.println("Enter 1 to to change tires");
				System.out.println("Enter 2 to delete car with diametr tires");
				System.out.println("Enter 3 to change tires");
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
					default:
						sc.close();
						return;
				
						}
					}
				}
				
				static void cars1(){
					System.out.println("Enter min diametr to change tiets");
					int min = sc.nextInt();
					System.out.println("Enter max diametr to change tiets");
					int max = sc.nextInt();
					System.out.println("Enter color to change tiets");
					String color = sc.next();
					Iterator<Car> iter = Set.iterator();
					if(!Set.isEmpty()){
					while (iter.hasNext()) {
						Car car = iter.next();
						if(car.getWheel().getDiameter()>=min&&car.getWheel().getDiameter()<=max&&car.getBody().getColor().equals(color)){
							car.getWheel().setTires("Winter");
						}
					}
					Set.forEach(System.out::println);
					}
				}
				static void cars2(){
					System.out.println("Enter min diametr to change tiets");
					int min = sc.nextInt();
					System.out.println("Enter max diametr to change tiets");
					int max = sc.nextInt();
					Iterator<Car> iter = Set.iterator();
					if(!Set.isEmpty()){
					while (iter.hasNext()) {
						Car car = iter.next();
						if(car.getWheel().getDiameter()>=min&&car.getWheel().getDiameter()<=max){
							iter.remove();
							}
					}
					Set.forEach(System.out::println);
				}
				}
				static void cars3(){
					System.out.println("Enter type of tires");
					String type = sc.next();
					System.out.println("Enter diametr of tiets");
					int Dim = sc.nextInt();
					Iterator<Car> iter = Set.iterator();
					if(!Set.isEmpty()){
					while (iter.hasNext()){
						Car car = iter.next();
						if(car.getWheel().getTires().equals(type)&&car.getWheel().getDiameter()==Dim){
							System.out.println(car);
							}
						}
					}
				}
			}