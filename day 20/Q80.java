// Write a program to Find column-wise sum.
import java.util.Scanner;

public class Q80 {

    static void inputMatrix(int[][] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void columnWiseSum(int[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            int sum = 0;

            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
            }

            System.out.println("Sum of elements of column " + (i + 1) + " : " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of Matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        int[][] matrix = new int[m][n];

        System.out.println("Enter Matrix Elements:");
        inputMatrix(matrix, sc);

        System.out.println("\nColumn-wise Sum:");
        columnWiseSum(matrix);

        sc.close();
    }
}
