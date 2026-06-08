
// Write a program to Print reverse pyramid.
// *********
//  *******
//   *****
//    ***
//     *
import java.util.*;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in the pattern");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
