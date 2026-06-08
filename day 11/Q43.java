
// Write a program to Write function to check prime
import java.util.Scanner;

public class Q43 {
    public static void Prime(int num) {
        int prime = 1;

        if (num == 0 || num == 0) {
            prime = 0;
            return;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                prime = 0;
                break;
            }

        }
        if (prime == 1)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to check whether it is prime or not");
        int a = sc.nextInt();
        sc.close();
        Prime(a);
    }
}
