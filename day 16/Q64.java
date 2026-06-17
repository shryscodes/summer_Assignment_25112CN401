// Write a program to Remove duplicates from
// array.

import java.util.Scanner;

public class Q64 {

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

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates: ");

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[j] == arr[i]) {
                    isDuplicate = true;
                    break ;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }

}
