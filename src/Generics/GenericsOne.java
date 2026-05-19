package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericsOne {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 8};
        String[] fruits = {"Pear", "Banana", "Apple", "Mango"};

        List<Integer> numbersList = convertToList(numbers);
        List<String> fruitsList = convertToList(fruits);

        System.out.println(numbersList);
        System.out.println(fruitsList);
    }

    private static <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }
}
