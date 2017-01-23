package testsJavaRush;

public class SumOfChars {

	public static void main(String[] args) {
		  System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
    	int e = 0;
        while (number > 0){
        	e += number % 10;
        	number /= 10;
        }
		return e;
    }
}
