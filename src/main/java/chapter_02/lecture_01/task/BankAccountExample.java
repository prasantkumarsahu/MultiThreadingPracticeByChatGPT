package chapter_02.lecture_01.task;

/**
 * Author: PRASANT
 * Date: 21/04/25
 */

public class BankAccountExample {
	public static void main(String[] args) throws InterruptedException {
		BankAccount ac = new BankAccount(2000);

		Thread t1 = new Thread(() -> {
			ac.withdraw(1000);
		});

		Thread t2 = new Thread(() -> {
			ac.withdraw(1500);
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Remaining balance : " + ac.cash);
	}
}

class BankAccount {
	int cash;

	public BankAccount(int cash) {
		this.cash = cash;
	}

	public synchronized void withdraw(int amount) {
		if (cash >= amount) {
			System.out.println("Withdrawing " + amount + " amount");
			cash -= amount;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		} else {
			System.out.println("Insufficient Balance!");
		}
	}
}
