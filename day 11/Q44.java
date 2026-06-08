// Write a program to Write function to find factorial
import java.util.Scanner;
import java.math.BigInteger;

public class Q44 {
    public static void factorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num + "! = " + fact);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        factorial(a);
          sc.close();
    }
}
