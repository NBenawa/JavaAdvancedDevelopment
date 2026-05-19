package Concurrency;

public class Threads {
    public static void main(String[] args) {
//        ThreadExample first = new ThreadExample();
//        ThreadExample second = new ThreadExample();

//        first.setName("First Thread");
//        second.setName("Second Thread");
//
//        first.start();
//        second.start();

        Thread first = new Thread(new ThreadExampleRunnable());
        Thread second = new Thread(new ThreadExampleRunnable());

        first.setName("First Thread");
        second.setName("Second Thread");

        first.start();
        second.start();
    }
}
