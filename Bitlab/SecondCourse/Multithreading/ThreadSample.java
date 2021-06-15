package BITLAB.Multithreading;

public class ThreadSample extends Thread {

    public String name;

    public ThreadSample(ThreadGroup tg, String name) {
        super(tg, name);
    }


    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " " + i);
                Thread.sleep(500);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
