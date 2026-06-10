// Write a program to Input and display array.
import java.util.* ;
public class Q49
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        //printing array
        System.out.println("Given array is");
        System.out.print("{");
        for(int i = 0; i < n; i++)
        {
            
            System.out.print(array[i]+ " ");
    
        }
        System.out.print("}");
        sc.close();
    }

}
