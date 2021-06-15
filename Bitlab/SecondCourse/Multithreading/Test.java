package BITLAB.Multithreading;

import java.sql.SQLOutput;

public class Test{

    public static void main(String[] args) throws InterruptedException {

//        ThreadGroup group = new ThreadGroup("MyGroup");
//
//        ThreadSample first = new ThreadSample(group, "Thread-1");
//        ThreadSample second = new ThreadSample(group, "Thread-2");
//        ThreadSample third = new ThreadSample(group, "Thread-3");
//
//
//        first.start();
//        second.start();
//        third.start();
//
//        while (group.activeCount() > 0){
//
//
//
//        }
//
//
//        int a = 15;
//        int b = 25;
//
//        System.out.println(a + b);
//        System.out.println("Hello");


//        MyThread thread = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        //start() - создает новый поток и выполняет метод run()
//        thread.start();
//        thread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();

    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            try {
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}
