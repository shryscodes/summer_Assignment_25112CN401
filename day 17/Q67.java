// Write a program to Intersection of arrays.
import java.util.Scanner;

public class Q67 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();

        if (n1 <= 0) {
            System.out.println("Size must be greater than 0!");
            sc.close();
            return;
        }

        int[] firstArray = new int[n1];

        System.out.println("Enter " + n1 + " elements for Array 1:");
        for (int i = 0; i < n1; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();

        if (n2 <= 0) {
            System.out.println("Size must be greater than 0!");
            sc.close();
            return;
        }

        int[] secondArray = new int[n2];

        System.out.println("Enter " + n2 + " elements for Array 2:");
        for (int i = 0; i < n2; i++) {
            secondArray[i] = sc.nextInt();
        }

        System.out.print("Intersection of arrays: ");

        boolean foundAny = false;

        // Intersection logic
        for (int i = 0; i < n1; i++) {

            // avoid duplicates from first array
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (firstArray[i] == firstArray[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // check in second array
            for (int j = 0; j < n2; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                    foundAny = true;
                    break;
                }
            }
        }

        if (!foundAny) {
            System.out.println("No common elements found.");
        }

        System.out.println();
        sc.close();
    }
}
