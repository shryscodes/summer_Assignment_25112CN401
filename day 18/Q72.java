// Write a program to Sort array in descending
// order.
import java.util.Scanner;

public class Q72 {
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

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Select the method of sorting");
        System.out.println("1. Bubble sort  2. Selection sort  3. Insertion sort");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Sorted array in descending order using Bubble sort:");

                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;

            case 2:
                System.out.println("Sorted array in descending order using Selection sort:");

                for (int i = 0; i < n - 1; i++) {
                    int maxIndex = i;

                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] > arr[maxIndex]) {
                            maxIndex = j;
                        }
                    }

                    if (i != maxIndex) {
                        int temp = arr[i];
                        arr[i] = arr[maxIndex];
                        arr[maxIndex] = temp;
                    }
                }
                break;

            case 3:
                System.out.println("Sorted array in descending order using Insertion sort:");

                for (int i = 1; i < n; i++) {
                    int key = arr[i];
                    int j = i - 1;

                    while (j >= 0 && arr[j] < key) {
                        arr[j + 1] = arr[j];
                        j--;
                    }

                    arr[j + 1] = key;
                }
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
