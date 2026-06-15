// Write a program to Rotate array right.

import java.util.Scanner;

public class Q59 {

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

        System.out.print("Enter number of positions to rotate right: ");
        int d = sc.nextInt();

        d = d % n;

        for (int i = 0; i < d; i++) {

            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        System.out.println("\nArray after right rotation by " + d + " positions:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
