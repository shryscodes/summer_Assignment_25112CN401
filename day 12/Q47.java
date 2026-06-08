
// Write a program to Write function for Fibonacci.
import java.util.Scanner;

public class Q47 {

    public static void Fibo(int n) {
        int a = 0, b = 1, next;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "     ");
            next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms in the series: ");
        int num = sc.nextInt();

        Fibo(num);

        sc.close();
    }

}
