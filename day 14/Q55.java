
// Write a program to Second largest element.
import java.util.*;

public class Q55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Array must contain atleast two elements: ");
            sc.close();
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }

            else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exist");
        } else {
            System.out.println("Second largest element is " + secondLargest);
        }

        sc.close();
    }

}
