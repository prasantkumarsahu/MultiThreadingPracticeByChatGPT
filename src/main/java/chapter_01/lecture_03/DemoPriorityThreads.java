package chapter_01.lecture_03;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

// 📌 Note: Priority does not guarantee order — it’s a hint to the scheduler

public class DemoPriorityThreads {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> System.out.println("Thread 1"));
		Thread t2 = new Thread(() -> System.out.println("Thread 2"));

		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.MAX_PRIORITY); // 10

		t1.start();
		t2.start();
	}
}
