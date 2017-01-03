package core.home16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {

		ExecutorService servis = Executors.newFixedThreadPool(2);
		Future<Integer> future = servis.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				new MyThread();
				RunnableThread RunTh = new RunnableThread();
				System.out.println();
				Thread fibRev = new Thread(RunTh);
				fibRev.start();
				return null;

			}

		});
		System.out.println(future.get());
		servis.shutdown();

	}
}
