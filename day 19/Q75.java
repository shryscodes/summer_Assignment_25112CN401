import java.util.Scanner;

public class Q75 {

    // Input matrix
    static void inputMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    // Print matrix with clean formatting
    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%6d", mat[i][j]);
            }
            System.out.println();
        }
    }

    // Transpose logic
    static int[][] transposeMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = mat[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("        MATRIX TRANSPOSE PROGRAM     ");
        System.out.println("====================================");

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("\nError: Rows and columns must be greater than 0!");
            sc.close();
            return;
        }

        int[][] matrix = new int[m][n];

        System.out.println("\nEnter matrix elements:");
        inputMatrix(matrix, sc);

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTransposed Matrix:");
        int[][] result = transposeMatrix(matrix);
        printMatrix(result);

        System.out.println("====================================");

        sc.close();
    }
}
