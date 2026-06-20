// Write a program to Multiply matrices.
import java.util.Scanner;

public class Q77 {
    static void inputMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] multiplyMatrix(int[][] a, int[][] b) {

        int[][] result = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MATRIX MULTIPLICATION PROGRAM ===");

        System.out.print("Enter the order of matrix: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid order!");
            sc.close();
            return;
        }

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        System.out.println("Enter matrix 1:");
        inputMatrix(matrix1, sc);

        System.out.println("Enter matrix 2:");
        inputMatrix(matrix2, sc);

        int[][] result = multiplyMatrix(matrix1, matrix2);
        System.out.println("Multiplication Matrix");
        printMatrix(result);

        System.out.println("====================================");
        sc.close();
    }
}
