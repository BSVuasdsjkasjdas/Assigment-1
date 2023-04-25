import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[0];
            try {
                arr = MyClass.readIntegersFromFile("input.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int sum = MyClass.sumArray(arr);
            System.out.println("Sum of array: " + sum);
        } catch (InvalidNumberException e) {
            System.out.println("Invalid number: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }

}