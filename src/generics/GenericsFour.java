package generics;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class GenericsFour {
    public static void main(String[] args) {
        List<List<Ticket>> ticketLists = asList(
                asList(new AdultTicket(), new AdultTicket()),
                asList(new ChildTicket(), new ChildTicket())
        );

        List<Ticket> tickets = flattenList(ticketLists);
        System.out.println(tickets);

        System.out.println("Total price: " + getTotalPrice(tickets));

        List<AdultTicket> adultTickets = asList(new AdultTicket(), new AdultTicket());
        System.out.println("Total price: " + getTotalPrice(adultTickets));
    }

    static <T> List<T> flattenList(List<List<T>> nestedList) {
        List<T> flattenedList = new ArrayList<>();
        nestedList.forEach(flattenedList::addAll);
        return flattenedList;
    }

    static int getTotalPrice (List<? extends Ticket> tickets) {
        int totalPrice = 0;
        for (Ticket ticket: tickets) {
            totalPrice += ticket.getPrice();
        }
        return totalPrice;
    }
}

abstract class Ticket {
    abstract int getPrice();
}

class AdultTicket extends Ticket {

    @Override
    int getPrice() {
        return 10;
    }

    @Override
    public String toString() {
        return "Adult Ticket";
    }
}

class ChildTicket extends Ticket {

    @Override
    int getPrice() {
        return 5;
    }

    @Override
    public String toString() {
        return "Child Ticket";
    }
}
