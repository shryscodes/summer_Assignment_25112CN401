// Write a program to Write function to find maximum
import java.util.Scanner;

public class Q42 {

    public static void max(int a, int b) {
        if (a > b)
            System.out.println(a + " is maximum");
        else if (b > a)
            System.out.println(b + " is maximum");
        else
            System.out.println("Both are equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        max(a, b);
    }

}
