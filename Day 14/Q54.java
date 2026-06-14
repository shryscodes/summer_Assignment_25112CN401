
// Write a program to Frequency of an element.
import java.util.*;

public class Q54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element whose frequence is to be found");
        int element = sc.nextInt();
        int frequency = 0;

        for (int i = 0; i < size; i++) {

            if (element == array[i]) {
                frequency++;
            }
        }

        System.out.println("Frequency of " + element + ": " + frequency);

        sc.close();

    }
}
