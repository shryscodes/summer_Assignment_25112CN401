// Write a program to Find longest word.

import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Sentence: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        String longestWord = "";

        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }


        System.out.println("Longest word: " + longestWord);
        sc.close();
    }
}
