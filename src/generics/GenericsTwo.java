package generics;

public class GenericsTwo {
    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle("Honda");
        Car car = new Car("Toyota");

        printNames(motorcycle);
        printNames(car);
    }

    private static <T extends Vehicle> void printNames(T vehicle) {
        System.out.println(vehicle.printName());
    }
}

class Vehicle {
    private final String name;
    Vehicle(String name) {
        this.name = name;
    }

    public String printName() {
        return this.name;
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String name) {
        super(name);
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }
}