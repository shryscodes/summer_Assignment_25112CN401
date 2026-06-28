// Write a program to Merge two sorted arrays

import java.util.Arrays;

public class Q97 {

    public static int[] merge(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }

        }

        while (i < m) {
            merged[k++] = arr1[i++];
        }

        while (j < n) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 35, 89, 90, 91, 110, 156, 189, 190, 211};

        int[] secondArray = {5, 36, 89, 90, 91, 92, 98, 100, 102};

        int[] result = merge(firstArray, secondArray);

        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}
