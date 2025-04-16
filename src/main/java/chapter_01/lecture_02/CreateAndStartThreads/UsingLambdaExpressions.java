package chapter_01.lecture_02.CreateAndStartThreads;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

/* Notes -
	- start() creates a new thread
	- run() runs in the current thread (not multithreaded)
 */

public class UsingLambdaExpressions {
	public static void main(String[] args) {

		Thread t = new Thread(() -> System.out.println("Child thread using lambda..."));
		t.start();

		System.out.println("Main thread running...");
	}
}
