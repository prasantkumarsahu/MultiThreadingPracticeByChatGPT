package chapter_01.lecture_03;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

// JVM will not wait for Daemon Threads

public class DemoDaemon {
	public static void main(String[] args) {

		Thread td = new Thread(() -> {
			try {
				Thread.sleep(1000);
				System.out.println("Daemon Thread running...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Thread t = new Thread(() -> System.out.println("Normal Thread running..."));

		td.setDaemon(true); // making 'td' thread a daemon thread

		t.start();
		td.start();

		System.out.println("Main Thread is running...");
	}
}
