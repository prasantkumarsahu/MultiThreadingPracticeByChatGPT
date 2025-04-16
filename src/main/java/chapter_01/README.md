# 📘 Chapter 1: Introduction to Multithreading (Java)

Welcome to Chapter 1 of the **Java Multithreading Mastery Series**.  
In this chapter, you’ll learn the foundations of multithreading, how to create threads, manage their lifecycle, and understand how Java handles thread priority and sleep.

---

## 📖 Lectures Overview

### ✅ Lecture 1: What is Multithreading and Why Use It?

- **Thread**: Smallest unit of execution in a program.
- **Multithreading**: Running multiple threads concurrently to:
  - Improve performance
  - Increase responsiveness
  - Efficiently use CPU resources
- **Use Cases**:
  - Web servers (handling many users)
  - File compression
  - UI rendering + background tasks
  - Chat apps, banking systems, etc.

---

### ✅ Lecture 2: Creating and Starting Threads

Java provides three primary ways to create threads:

#### 1️⃣ Extending `Thread` class
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }
}
MyThread t = new MyThread();
t.start();
```

#### 2️⃣ Implementing `Runnable` interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread via Runnable");
    }
}
Thread t = new Thread(new MyRunnable());
t.start();
```

#### 3️⃣ Using Lambda (Functional shortcut for Runnable)
```java
Thread t = new Thread(() -> System.out.println("Lambda thread!"));
t.start();
```

> ⚠️ Always use `start()` to begin a new thread.  
> Calling `run()` directly will run in the current thread (no multithreading).

---

### ✅ Lecture 3: Thread Lifecycle, Sleep, and Priorities

#### 🧬 Thread Lifecycle

| State        | Description                            |
|--------------|----------------------------------------|
| NEW          | Thread created, not started            |
| RUNNABLE     | Eligible for running                   |
| RUNNING      | Currently executing                    |
| BLOCKED/WAITING | Paused, waiting for a resource      |
| TERMINATED   | Execution completed                    |

#### ⏱️ Thread Sleep
```java
Thread.sleep(1000); // Pauses for 1 second
```

- Used to simulate delay or wait between tasks.

#### ⚖️ Thread Priorities
```java
t.setPriority(Thread.MAX_PRIORITY); // Value: 10
t.setPriority(Thread.MIN_PRIORITY); // Value: 1
```

- Priority is a **hint** to the thread scheduler, **not a guarantee**.

#### 🛏️ Daemon Threads
```java
Thread t = new Thread(() -> {...});
t.setDaemon(true);
```
- Daemon threads run in the background and stop when the main thread finishes.

---

## 💻 Practice Tasks (Mini Projects)

### 🧪 Task 1: Print from Main and Child Thread
- Use either `Thread` or `Runnable`.

### 🧪 Task 2: Counter with Sleep
- Use `Thread.sleep(1000)` to count from 1 to 5 with 1-second intervals.

### 🧪 Task 3: Priority-Based Race
- Create 2 threads with different priorities.
- Print numbers from different ranges (1–5 and 6–10).

---

## 🧰 Tools Required

- Java 8 or above
- Any IDE (VS Code, IntelliJ IDEA, Eclipse)
- Terminal or Command Prompt

---
