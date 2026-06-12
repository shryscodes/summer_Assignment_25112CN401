// Write a program to Count even and odd
// elements.

import java.util.*;

public class Q52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int even = 0, odd = 0;

        for (int i = 0; i < size; i++) {

            if (array[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even elements: " + even);
        System.out.println("Odd elements: " + odd);

        sc.close();

    }
}
