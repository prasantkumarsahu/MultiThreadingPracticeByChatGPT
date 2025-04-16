package chapter_01.lecture_03;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

public class DemoSleep {
	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Count: " + i);

				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		t.start();
	}
}
