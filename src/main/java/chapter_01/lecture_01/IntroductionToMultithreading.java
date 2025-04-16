package chapter_01.lecture_01;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

public class IntroductionToMultithreading {
	public static void main(String[] args) {

		Runnable task = () -> System.out.println("Child thread running...");
		Thread t = new Thread(task);
		t.start();

		System.out.println("Main thread running...");
	}
}
