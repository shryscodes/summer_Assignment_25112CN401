// Write a program to Union of arrays. 
import java.util.Scanner;

public class Q66 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();

        // Validate array sizes
        if (size1 <= 0 || size2 <= 0) {
            System.out.println("Array sizes must be greater than 0.");
            sc.close();
            return;
        }

        int[] firstArray = new int[size1];
        int[] secondArray = new int[size2];

        System.out.println("\nEnter " + size1 + " elements for the first array:");
        for (int i = 0; i < size1; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.println("\nEnter " + size2 + " elements for the second array:");
        for (int i = 0; i < size2; i++) {
            secondArray[i] = sc.nextInt();
        }

        int unionSize = size1 + size2;
        int[] unionArray = new int[unionSize];

        // Copy elements of first array
        for (int i = 0; i < size1; i++) {
            unionArray[i] = firstArray[i];
        }

        // Copy elements of second array
        for (int i = 0; i < size2; i++) {
            unionArray[size1 + i] = secondArray[i];
        }

        System.out.println("\nUnion of the two arrays:");

        // Print only the first occurrence of each element
        for (int i = 0; i < unionSize; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (unionArray[i] == unionArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(unionArray[i] + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}
