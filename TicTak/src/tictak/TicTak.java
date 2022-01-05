package tictak;

public class TicTak {
    static int num=20;
    static private Object monitor= new Object();

    public static void main(String[] args) {
        ThreadOne thr1 = new ThreadOne (monitor);
        ThreadTwo thr2 = new ThreadTwo (monitor);

        thr1.start();
        thr2.getThread().start();

        try {
            thr1.join();
            thr2.getThread().join();
        }
        catch (InterruptedException e) { e.printStackTrace();}
    }
}