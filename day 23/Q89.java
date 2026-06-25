// Write a program to Find first non-repeating
// character.

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String: ");
        String str = sc.nextLine();

        int[] frequency = new int[256];

        // counting frequency of each charcter
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // returning the very first element with 1 frequency
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }

        System.out.println("=========== THANK YOU ===========");
        sc.close();
    }
}
