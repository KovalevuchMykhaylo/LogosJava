package mortalcombat;

public class Random {
	static int random(int min, int max){
		return (int) Math.round(Math.random()*(max-min)+min);
	}
}
