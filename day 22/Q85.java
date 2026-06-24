// Write a program to check palindrome string

import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the String: ");
        String str = sc.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {

            char left = str.charAt(i);
            char right = str.charAt(str.length() - 1 - i);

            // Convert uppercase to lowercase (manual)
            if (left >= 'A' && left <= 'Z') {
                left = (char) (left + 32);
            }

            if (right >= 'A' && right <= 'Z') {
                right = (char) (right + 32);
            }

            // Compare characters
            if (left != right) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }

        sc.close();
    }
}
