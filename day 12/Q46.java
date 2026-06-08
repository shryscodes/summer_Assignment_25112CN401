// Write a program to Write function for Armstrong

import java.util.Scanner;

public class Q46 {
    public static int Digits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count ;  
    }

    public static boolean isArmstrong(int num)
    {
        int digitCount = Digits(num) ;
        int temp = num , sum = 0 , d;
        while(temp != 0)
        {
            d = temp % 10;
            sum = sum + (int) Math.pow(d, digitCount) ;
            temp/= 10 ;
        }
        return num == sum ;

    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check is Armstrong or not");
        int a = sc.nextInt();

        if (isArmstrong(a)) {
            System.out.println(a + " is an Armstrong number");
        }

        else
            System.out.println(a + " is not an Armstrong number");

        sc.close();
    }

}
