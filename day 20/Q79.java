// Write a program to Find row-wise sum.
import java.util.Scanner;

public class Q79 {

    static void inputMatrix(int[][] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void rowWiseSum(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;

            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }

            System.out.println("Sum of elements of row " + (i + 1) + " : " + sum);
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

        System.out.println("\nRow-wise Sum:");
        rowWiseSum(matrix);

        sc.close();
    }
}
