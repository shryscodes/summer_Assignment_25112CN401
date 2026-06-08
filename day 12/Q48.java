// Write a program to Write function for perfect
// number.
import java.util.*;

public class Q48 {

    public static Boolean isPerfect(int num) {
        int sum = 0, temp;
        temp = num;
        for (int i = 1; i <= num / 2; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }
        return temp == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check is perfect or not: ");
        int n = sc.nextInt();

        if (isPerfect(n))
            System.out.println(n + " is a perfect number");

        else
            System.out.println(n + " is not a perfect number");

        sc.close();
    }

}
