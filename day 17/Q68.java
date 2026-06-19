// Write a program to Find common elements.

import java.util.Scanner;

public class Q68 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of First Array:");
        int n1 = sc.nextInt();

        if(n1 <= 0){
            System.out.println("Size must be greater than 0!");
            sc.close();
            return ;
        }

        int[] firstArray = new int[n1];
        
        System.out.println("Enter " + n1 + " elements in First Array:");
        for(int i = 0; i < n1; i++){
            firstArray[i] = sc.nextInt();
        }

        System.out.println("Enter the size of Second Array:");
        int n2 = sc.nextInt();

        if(n2 <= 0){
            System.out.println("Size must be greater than 0!");
            sc.close();
            return ;
        }

        int[] secondArray = new int[n2];

        System.out.println("Enter " + n2 + " elements in Second Array: ");
        for(int i = 0; i < n2; i++){
            secondArray[i] = sc.nextInt();
        }


        //Finding common elements and printing on the console along with duplicates
        System.out.println("Common Elements:");

        boolean found = false;

        for(int i = 0; i < n1; i++){

            for(int j = 0; j < n2; j++){

                if(firstArray[i] == secondArray[j]){
                    System.out.print(firstArray[i] + " ");
                    found = true;
                    break;
                
                }
            }
        }

        if(!found){
            System.out.println("No common elements found");
        }

        sc.close();
    }
}

