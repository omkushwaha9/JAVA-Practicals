class MyRunnable1 implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable Interface");
    }
}

class MyRunnable2 implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable Interface");
    }
}

public class p7_1 {

    public static void main(String[] args) {

        MyRunnable1 myRunnable = new MyRunnable1();

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}