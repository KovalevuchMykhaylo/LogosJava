package core.home16;

import java.util.Scanner;

public class RunnableThread implements Runnable {
	private static final Scanner sc = new Scanner(System.in);

	public void run() {
		fibochiani();
	}

	public void fibochiani() {
		synchronized (RunnableThread.class) {
			System.out.println("Enter real number:");
			int n = sc.nextInt();
			int[] fabochiani = new int[n];

			int a = 1, b = 1;
			int i = 2;
			fabochiani[0] = 0;
			fabochiani[1] = 1;
			while (i < n) {
				fabochiani[i] = a + b;
				a = b;
				b = fabochiani[i];
				i++;
			}
			for (int j = fabochiani.length - 1; j >= 0; j--) {
				System.out.print(fabochiani[j] + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}