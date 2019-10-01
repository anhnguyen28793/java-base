package vn.com.base;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();

        MyThread1 t = new MyThread1();
        Thread instanceT = new Thread(t);
        instanceT.setName("Thread A");
        MyThread1 tt = new MyThread1();
        Thread instanceTT = new Thread(t);
        instanceTT.setName("Thread A");
//        MyThread2 t2 = new MyThread2();
//        t2.setName("Thread B");

        instanceT.start();
        instanceTT.start();
//        t2.start();

        main.test();
    }

    public void test() throws InterruptedException {
        System.out.println("START MAIN");
//        Thread.sleep(10000);
//        System.out.println("END");

    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        try {
            test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
            System.out.println("A: " + i);
        }

    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
            System.out.println("B: " + i);
        }
    }
}
