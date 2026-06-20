// Write a program to Find diagonal sum.
import java.util.Scanner;

public class Q76 {
    // Input matrix
    static void inputMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    static int sumDiagonal(int[][] mat) {
        int sum = 0;

        int limit = (mat.length < mat[0].length) ? mat.length : mat[0].length;

        for (int i = 0; i < limit; i++) {
            sum += mat[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DIAGONAL SUM PROGRAM ===");

        System.out.print("Enter the order of matrix m x n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Invalid order!");
            sc.close();
            return;
        }

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements");
        inputMatrix(matrix, sc);

        int sum = sumDiagonal(matrix);

        System.out.println("Sum of diagonal: " + sum);
        System.out.println("====================================");
        sc.close();
    }
}
