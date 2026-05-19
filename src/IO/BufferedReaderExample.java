package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/IO/file.txt"))) {
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
