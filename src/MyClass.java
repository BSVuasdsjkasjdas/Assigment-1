import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {
    private MyClass() {
        // private constructor to prevent instantiation
    }

    public static int[] readIntegersFromFile(String fileName) throws IOException, InvalidNumberException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) {
            try {
                int num = Integer.parseInt(line);
                if (num < 0) {
                    throw new InvalidNumberException("Invalid number: " + num);
                }
                arr[i++] = num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + line);
            }
        }
        reader.close();
        return arr;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum == 0) {
            throw new ArithmeticException("Sum is zero");
        }
        return sum;
    }
}
