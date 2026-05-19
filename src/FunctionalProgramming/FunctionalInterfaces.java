package FunctionalProgramming;

import FunctionalProgramming.FunctionalInterfacesExtras.Greeting;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // Using lambda functions with functional interfaces
        Greeting helloWorld = () -> System.out.println("Hello World!");
        helloWorld.printMessage();

        Greeting goodAfternoon = () -> System.out.println("Good Afternoon!");
        goodAfternoon.printMessage();

        Greeting goodEvening = () -> System.out.println("Good Evening");
        goodEvening.printMessage();
    }
}
