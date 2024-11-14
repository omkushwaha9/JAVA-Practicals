class MyRunnable implements Runnable {
    String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is running with priority " + Thread.currentThread().getPriority());
    }
}

public class p7_3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}