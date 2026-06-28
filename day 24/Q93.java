
// Write a program to Check string rotation.
import java.util.Scanner;

public class Q93 {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String temp = s1 + s2;
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String s1: ");
        String s1 = sc.nextLine();

        System.out.print("Input String s2: ");
        String s2 = sc.nextLine();

        if (isRotation(s1, s2)) {
            System.out.println("Strings are Rotation");
        } else {
            System.out.println("Strings are not Rotation");
        }

        System.out.println("========= THANK YOU =========");
        sc.close();
    }
}
