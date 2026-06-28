// Write a program to Sort words by length.

import java.util.Scanner;

public class Q100 {
    public static String[] sortString(String[] str) {

        for (int i = 0; i < str.length - 1; i++) {

            for (int j = i + 1; j < str.length; j++) {

                if (str[i].length() > str[j].length()) {

                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] str = new String[n];

        System.out.println("Enter words");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        System.out.println("============ Sorted String ============");
        sortString(str);

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + ", ");
        }

        sc.close();
    }
}
