
// Write a program to Rotate array left
import java.util.*;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(" ! Array size must be greater than zero !");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of positions to rotate left: ");
        int d = sc.nextInt();

        d = d % n; // to handle d > n

        for (int i = 0; i < d; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation by " + d + "positions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
