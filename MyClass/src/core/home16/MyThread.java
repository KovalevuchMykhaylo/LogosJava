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
		synchronized (MyThread.class){
		System.out.println("Enter real number:");
		int n = sc.nextInt();
		 int a = 1, b = 1;
	        System.out.print(a + " " + b);
	        int fib = 2, i = 2;
	        while (i < n) {
	            fib = a + b;
	            a = b;
	            b = fib;
	            try {
					Thread.sleep(1000);
	            System.out.print(" " + fib);
	            i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		}
	}
}
