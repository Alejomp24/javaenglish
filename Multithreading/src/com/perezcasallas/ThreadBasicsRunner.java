package com.perezcasallas;

class Task1 extends Thread {

	private int number;

	public Task1(int number) {
		this.number = number;
	}
	@Override
	public void run() { // Signature
		System.out.print("\nTask " + number + " Started");

		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask " + number + " Done");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() { // Signature
		System.out.print("\nTask 2 Started");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 2 Done\n");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task 1
		System.out.println("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.start(); // Indica que se ejecuta en paralelo el hilo

		// Task 2
		System.out.println("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start(); // Indica que se ejecuta en paralelo el hilo

		task1.join();


		// Task 3
		for (int i = 301; i <= 399; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nTask 3 Done\n");

	}

}
