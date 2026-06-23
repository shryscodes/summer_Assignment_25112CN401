// Write a program to Convert lowercase to
// uppercase.

import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the string: ");
        String str = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        //not using string result as everytime a new character is added to result a new string is formed and we know that strings are immutable which makes the program less efficient

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }

        System.out.println("Uppercase String : " + result);
        sc.close();
    }
}
