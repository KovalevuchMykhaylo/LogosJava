package Lessson4;

public class classles4 {

	public static void main(String[] args) {
		//int [] array = new int [10];
		//print(array);
		//addRandom(array, 5, 15);
		//mas(array, 5, 15);
	    //imcrease(1, 5);
		
	}
	
	static int random(int min, int max){
	return (int) Math.round(Math.random()*(max-min)+ min);
	
	
	}
	
	static void ad(int[] array){
		for (int i = 0; i < array.length; i++){
		array[i]= i+1;
		}
	}
	static void addRandom(int[] array, int min, int max){
		for (int i = 0; i < array.length; i++) {
			array[i] = random(min, max);
		}
	}

	 static int[] mas(int lenght, int min, int max) {
		int array[]= new int[lenght];
		addRandom(array, min, max);
		return array;
	}
	static int[] imcrease (int[] array, int length){
		int array1[] = new int [array.length+length];
		for (int i = 0; i < array1.length; i++) {
			array1[i]= array[i]; 
		}
		return array1;
	}
	
	
}
