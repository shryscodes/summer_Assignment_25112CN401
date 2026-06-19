// Write a program to Add matrices.
import java.util.*;

public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of matrice mXn");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[m][n];
        int[][] mat3 = new int[m][n];

        System.out.println("Enter elements of matrix 1: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix 2: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Result");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d",mat3[i][j] );
            }
            System.out.println();
        }

        sc.close();
    }
}
