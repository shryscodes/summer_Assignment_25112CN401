// Write a program to Subtract matrices.

import java.util.Scanner;

public class Q74 {

    static void inputMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of matrix m x n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Invalid matrix size.");
            sc.close();
            return;
        }

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];

        System.out.println("Enter elements of matrix 1: ");
        inputMatrix(matrix1, sc);
        
        System.out.println("Enter elements of matrix 2: ");
        inputMatrix(matrix2, sc);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();


        int[][] result;

        switch(choice) {
            case 1:
                result = addMatrices(matrix1, matrix2);
                System.out.println("Addition of matrices:");
                break;
            case 2:
                result = subtractMatrices(matrix1, matrix2);
                System.out.println("Subtraction of matrices:");
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        printMatrix(result);
        sc.close();
    }
}

