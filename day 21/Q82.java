// Write a program to Reverse a string.

import java.util.Scanner;

public class Q82 {

    static String stringReversing(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length() - i - 1);
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the String: ");
        String str = sc.nextLine();

        System.out.print("Reversed String: " + stringReversing(str));

        sc.close();
    }
}
