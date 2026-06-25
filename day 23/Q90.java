// Write a program to Find first repeating
// character.

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String: ");
        String str = sc.nextLine();

        int[] frequency = new int[256];
        boolean found = false ;

        for(int i = 0; i < str.length(); i++){
            frequency[str.charAt(i)] ++;
        }

        for(int i = 0; i < str.length(); i++){
            if(frequency[str.charAt(i)] > 1){
                System.out.println("First repeating character: " + str.charAt(i));
                found = true; 
                break;
            }
        }

        if(!found){
            System.out.println("No repeating character found");
        }
        System.out.println("=========== THANK YOU ==========");
        sc.close();
    }
}
