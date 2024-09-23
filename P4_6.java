import java.util.*;

public class P4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];

        System.out.println("Enter " + n + " floating-point numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.print("Enter the number to search (d): ");
        double d = scanner.nextDouble();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == d) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Number " + d + " is present " + count + " times in the array.");
        } else {
            System.out.println("Number " + d + " is not present in the array.");
        }

    }
}