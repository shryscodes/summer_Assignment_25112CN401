// Write a program to Count words in a
// sentence.
import java.util.Scanner;

public class Q86 {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        boolean isWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the current character is a space, tab, or newline
            if (ch == ' ' || ch == '\t' || ch == '\n') {
                isWord = false; 
            } 
            // If the character is not a space and previous state was false, it's a new word
            else if (!isWord) {
                isWord = true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String text = sc.nextLine();
        System.out.println("Word count: " + countWords(text)); // Output: 4
        
        sc.close();
    }
}
