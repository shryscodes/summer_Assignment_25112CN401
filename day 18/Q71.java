
// Write a program to Binary search.
import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Size must be greater than 0!");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (key == arr[mid]) {
                System.out.println(key + " found at index " + mid);
                found = true;
                break;
            }

            else if (key < arr[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println(key + " not found");
        }

        sc.close();
    }
}
