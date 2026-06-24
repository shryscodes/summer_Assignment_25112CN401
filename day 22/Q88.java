// Write a program to Remove spaces from
// string.

import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        String result = text.replace(" ", "");
        System.out.println("===========REMOVING SPACES===========");
        System.out.println(result);
        System.out.println("=====================================");
        System.out.println();

        sc.close();
    }
}
