package core.less16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// throws InterruptedException {
		ExecutorService servis = Executors.newFixedThreadPool(10);
		new MyThread();
		new MyThread();
		new MyThread();
		new MyThread();
		Future<String> future =  servis.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.sleep(1000);
				return "Hellow";
			}
		});
		// Thread.sleep(1);
		System.out.println("Done");
		System.out.println(future.get());
		servis.shutdown();
	}

}//Книга 1999 год  автор doug lee