package fineprograming;

public class TemperatureConverter {

	public static void main(String[] args) {
		convertTemp(10, 'c');

	}
	public static String convertTemp(int temperature, char convertTo){
		switch (convertTo) {
				case 'c':
		{
			double celcii =(temperature-32)*5/9;
			System.out.println(celcii);
			break;
		}
				case 'f':{
					double farin =9/5*temperature+32;
			System.out.println(farin);
			break;
		}
		}
		return null;
		
	}
}
