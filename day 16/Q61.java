// Write a program to Find missing number in array.

import java.util.Scanner;

public class Q61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the max number in the sequence: ");
        int max = sc.nextInt();

        if (max <= 0) {
            System.out.println("Max number must be greater than 0!");
            sc.close();
            return;
        }

        int size = max - 1;
        int[] arr = new int[size];

        System.out.println(
                "Enter " + size +
                " numbers from 1 to " + max +
                " with one number missing:"
        );

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = max * (max + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < size; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}
