// Write a program to Find maximum occurring
// character.

import java.util.Scanner;

public class Q92 {
    public static char maxfreq(String str){
        int[] count = new int[256];

        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }

        int max = 0;
        for(int i = 0; i < 256; i++){
            if(count[max] < count[i]){
                max = i;
            }
        }

        return (char)max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String: ");
        String str = sc.nextLine();

        System.out.println("Maximum occuring character: " + maxfreq(str));
        System.out.println("========== THANK YOU ==========");
        sc.close();
    }
}
