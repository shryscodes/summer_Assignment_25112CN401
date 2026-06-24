// Write a program to Character frequency.

import java.util.Scanner;

public class Q87 {
    public static void printFrequency(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }

        // Array to store counts of 256 ASCII characters
        int[] count = new int[256];

        // Increment count for each character's ASCII index
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Print characters that appeared at least once
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println("'" + (char) i + "' : " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();
        printFrequency(text);

        sc.close();
    }
}
