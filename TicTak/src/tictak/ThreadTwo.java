package tictak;

public class ThreadTwo implements Runnable {
    private Thread thread;
    private Object monitor;

    public Thread getThread() {
        return thread;
    }

    public ThreadTwo(Object monitor) {
        this.monitor = monitor;
        thread = new Thread(this);
    }

    public void run() {
        synchronized (monitor) {

            try {
                Thread.sleep(1);

                for (int i = 0; i < TicTak.num; i++) {
                    monitor.notify();
                    System.out.println(2);
                    monitor.wait();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }monitor.notify();
        }
    }
}
