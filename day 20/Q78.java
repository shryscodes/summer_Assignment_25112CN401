// Write a program to Check symmetric matrix.

import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHECK WHETHER MATRIX IS SYMMETRIC OR NOT ===");
        System.out.print("Enter the order of square matrix: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        int[][] arr = new int[size][size];

        System.out.println("Enter Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("Given Matrix is not Symmetric");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("Given Matrix is Symmetric");
        System.out.println("====================================");
        sc.close();
    }
}
