package chapter_01.lecture_02.CreateAndStartThreads;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

public class ImplementingTheRunnableInterface {
	public static void main(String[] args) {

		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		System.out.println("Main thread running...");
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Child thread running (Runnable)...");
	}
}