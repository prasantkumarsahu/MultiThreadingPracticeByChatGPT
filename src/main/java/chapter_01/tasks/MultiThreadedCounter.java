package chapter_01.tasks;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

public class MultiThreadedCounter {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Counter(1, 5), "t1");
		Thread t2 = new Thread(new Counter(6, 10), "t2");

		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
	}
}

class Counter implements Runnable {
	int start;
	int end;

	public Counter(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			System.out.println("Counter " + Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
