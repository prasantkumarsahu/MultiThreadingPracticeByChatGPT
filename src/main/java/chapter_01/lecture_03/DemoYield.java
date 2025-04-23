package chapter_01.lecture_03;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

/*
Note -
	- Suggests the current thread should pause and let others run.
	- Not a guarantee — the scheduler decides.
 */

public class DemoYield {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			Thread.yield();
			System.out.println("Thread 1");
		});
		Thread t2 = new Thread(() -> System.out.println("Thread 2"));

		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.MAX_PRIORITY); // 10

		t1.start();
		t2.start();
	}
}
