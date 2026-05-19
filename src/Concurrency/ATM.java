package Concurrency;

public class ATM {
    private int amount;
    ATM (int amount) {
        this.amount = amount;
    }
    public synchronized void withdraw(int amount) {
        if (amount < this.amount) {
            this.amount = this.amount - amount;
            System.out.println("The amount " + amount + " was withdrawn!");
            System.out.println("Current amount is: " + this.amount);
        } else {
            System.out.println("The transaction is declined!");
            System.out.println("Current amount is: " + this.amount);
        }
    }
}
