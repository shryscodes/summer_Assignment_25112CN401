    // Write a program to Write function to find sum of two numbers
    import java.util.Scanner;

    public class Q41 {

        public static void printSum(int a, int b) {
            int sum = a + b;
            System.out.println("Sum is: " + sum);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();
                

            printSum(a, b);

            sc.close();
        }
    }
