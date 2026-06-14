// Write a program to Linear search. 
import java.util.*;

public class Q53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        int index = -1;


        for (int i = 0; i < size; i++) {
            if (key == array[i]) {
                index = i;
                break;
            }
        }

        
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(key + " found at index " + index);
        }

        sc.close();
    }
}
