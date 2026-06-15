// Write a program to Move zeroes to end.

import java.util.*;

public class Q60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be greater than 0!");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < n) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeroes to end:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
