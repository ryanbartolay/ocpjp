package practicetest14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TestingNumber11 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 10;
	}
	
}

public class Number11 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> a = service.submit(new TestingNumber11());
		System.out.println(a.get());
	}
}
