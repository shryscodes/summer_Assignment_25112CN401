
// Write a program to Find largest and smallest
// element.
import java.util.*;

public class Q51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Largest element of the array is " + max);
        System.out.println("Smallest element of the array is " + min);

        sc.close();

    }
}
