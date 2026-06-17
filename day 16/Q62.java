// Write a program to Find maximum frequency element.

import java.util.Scanner;

public class Q62 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be greater than 0!");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum frequency element: " + maxElement);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}
