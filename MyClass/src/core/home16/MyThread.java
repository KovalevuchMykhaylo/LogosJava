package core.home16;

import java.util.Scanner;

public class MyThread extends Thread {
	private static final Scanner sc = new Scanner(System.in);

	public MyThread() {
		start();
	}

	@Override
	public void run() {
		fibochiani();
	}

	public void fibochiani() {
		System.out.println("Enter real number:");
		int a = 1;
		int b = 1;
		int sumFib = 0;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sumFib = a + b;
			a = b;
			b = sumFib;

			System.out.print(sumFib + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
