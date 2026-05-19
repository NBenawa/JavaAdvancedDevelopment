package FunctionalProgramming;

import FunctionalProgramming.MethodReferenceExtras.NumberUtils;

import java.util.List;

import static java.util.Arrays.asList;

public class MethodReference {
    public static void main(String[] args) {

        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8);
        // numbers.forEach(number -> NumberUtils.evenOrOdd(number));

        // above line could be simplified as
        numbers.forEach(NumberUtils::evenOrOdd);
    }
}
