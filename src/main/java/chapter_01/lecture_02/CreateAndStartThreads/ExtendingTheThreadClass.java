package chapter_01.lecture_02.CreateAndStartThreads;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

public class ExtendingTheThreadClass {
	public static void main(String[] args) {

		Thread t = new MyThread();
		t.start();

		System.out.println("Main thread running...");
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Child thread running...");
	}
}
