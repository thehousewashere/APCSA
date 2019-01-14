package Chapter07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Builds a basic array
 *
 * @author Joseph Mecoy
 */
public class P7 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int[] numbers = new int[input.nextInt()];

        fillArray(numbers, input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * fillArray
     *
     * @param numbers whats going to be in the array
     * @param input what the user types in
     */
    public static void fillArray(int[] numbers, Scanner input) {
        System.out.print("Enter " + numbers.length + " elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * average method
     *
     * @param numbers what numbers are in the array
     * @return the numbers from the array
     */
    public static double average(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    /**
     * displayArray
     *
     * @param numbers the numbers in the array
     */
    public static void displayArray(int[] numbers) {
        System.out.println("The contents of the array: " + Arrays.toString(numbers));
    }
}
