package tictak;

public class ThreadOne extends Thread {
    Object monitor;

    public ThreadOne(Object monitor) {
        this.monitor = monitor;
    }

    public void run() {

        synchronized (monitor) {

            try {
                for (int i = 0; i < TicTak.num; i++) {
                    monitor.notify();
                    System.out.print(1 + " - ");
                    monitor.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }monitor.notify();
        }

    }
}
