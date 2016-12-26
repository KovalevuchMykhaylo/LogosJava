package core.home16;

import java.util.Scanner;

public class RunnableThread implements Runnable {
	private static final Scanner sc = new Scanner(System.in);

	public void run() {
		fibochiani();
	}

	public void fibochiani() {
		System.out.println("Enter real number:");
		int num = sc.nextInt();

		int[] fibochiani = new int[num];

		int a = 0;
		int b = 1;
		int i = 0;
		fibochiani[0] = 0;
		fibochiani[1] = 1;

		while (i < num) {
			fibochiani[i] = a + b;
			a = b;
			b = fibochiani[i];
			i++;
		}
		for (int j = fibochiani.length - 1; j >= 0; j--) {
			System.out.print(fibochiani[j] + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}