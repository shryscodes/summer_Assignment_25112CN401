// Write a program to Merge arrays.

import java.util.Scanner;

public class Q65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1 and array 2: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Size must be greater than 0!");
            sc.close();
            return;
        }

        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        System.out.println("Enter " + a + " elements in arr1:");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + b + " elements in arr2:");
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[a + b];

        for (int i = 0; i < a; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < b; i++) {
            arr3[a + i] = arr2[i];
        }

        System.out.println("Merged array:");

        for (int num : arr3) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
