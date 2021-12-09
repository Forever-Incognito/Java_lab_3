package task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(final String[] args) {
        final Thread thread1 = new Thread(new Runnable1());
        final Thread thread2 = new Thread(new Runnable2());
        final Thread thread3 = new Thread(new Runnable3());
        final Thread thread4 = new Thread(new Runnable4());
        final Thread thread5 = new Thread(new Runnable5());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        final ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(thread5);

        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }
    }

    public static class Runnable1 implements Runnable {
        @Override
        public void run() {
            calculations.add(6, 2);
        }
    }

    public static class Runnable2 implements Runnable {
        @Override
        public void run() {
            calculations.sub(6, 2);
        }
    }

    public static class Runnable3 implements Runnable {
        @Override
        public void run() {
            calculations.multi(6, 2);
        }
    }

    public static class Runnable4 implements Runnable {
        @Override
        public void run() {
            calculations.divide(6, 2);
        }
    }

    public static class Runnable5 implements Runnable {
        @Override
        public void run() {
            System.out.println("Executed another thread");
        }
    }
}
