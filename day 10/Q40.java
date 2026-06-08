// Write a program to Print character pyramid.
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

import java.util.*;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in the pattern");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // printing characters in two loop
            for (int j = 1; j <= i; j++) {

                System.out.print((char) ('A' + j - 1));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
        sc.close();

    }
}
