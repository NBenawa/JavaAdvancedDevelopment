package Concurrency;

import FunctionalProgramming.FunctionalInterfacesExtras.Greeting;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {
    public static void main(String[] args) {
        Thread first = new ThreadExample();
        first.setName("First Thread");

        Thread second = new ThreadExample();
        second.setName("First Thread");

        Thread third = new ThreadExample();
        third.setName("First Thread");

        Thread fourth = new ThreadExample();
        fourth.setName("First Thread");

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(first);
        executorService.execute(second);
        executorService.execute(third);
        executorService.execute(fourth);

        executorService.shutdown();
    }
}
