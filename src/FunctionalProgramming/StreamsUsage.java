package FunctionalProgramming;

import java.sql.SQLOutput;
import java.util.List;

import static java.util.Arrays.asList;

public class StreamsUsage {
    public static void main(String[] args) {
        List<String> fruit = asList("apple", "pineapple", "banana", "pear", "strawberry");

        fruit.stream()
                .map(String::toUpperCase)
                .filter(item -> item.startsWith("P"))
                .sorted()
                .forEach(System.out::println);
    }
}
