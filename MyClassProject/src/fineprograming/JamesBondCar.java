package fineprograming;

public class JamesBondCar extends Car {

	public static void main(String[] args) {
		JamesBondCar.drive(5);
	}
    static int drive(int howlong){
    	 int distanse = (howlong*180);
    	 System.out.println(distanse);
		return distanse;
					}

}
