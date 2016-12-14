package Lesson3;

public class classwork {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int[] array1 = new int[10];
		int a = array[0];
		array[0] = 7;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i+1;
			System.out.print(array1[i]+" ");
		}
	}
}
