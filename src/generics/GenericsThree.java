package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsThree {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        Jacket jacket = new Jacket();

        checkOutItem(shirt);
        checkOutItem(jacket);

        List<Item> items = new ArrayList<>();
        items.add(shirt);
        items.add(jacket);

        checkOutAllItems(items);
    }

    private static void checkOutAllItems(List<? extends Item> items) {
        items.forEach(GenericsThree::checkOutItem);
    }

    public static void checkOutItem (Item item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }
}

abstract class Item {
    abstract Integer getPrice();
    abstract String getName();
}

class Shirt extends Item {

    @Override
    Integer getPrice() {
        return 10;
    }

    @Override
    String getName() {
        return "Shirt";
    }
}

class Jacket extends Item {

    @Override
    Integer getPrice() {
        return 30;
    }

    @Override
    String getName() {
        return "Jacket";
    }
}