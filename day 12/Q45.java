// Write a program to Write function for pallindrome
import java.util.Scanner;

public class Q45 {

    public static int reverse(int num) {
        int rev = 0, d;

        while (num != 0) {
            d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        return rev;
    }

    public static boolean isPallindrome(int num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check is pallindrome or not: ");
        int a = sc.nextInt();

        if (isPallindrome(a))
            System.out.println(a + " is pallindrome");
        else
            System.out.println(a + " is not pallindrome");

        sc.close();

    }
}
