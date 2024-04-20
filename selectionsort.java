import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 25, 53, 1, -5};
        int size = arr.length;
        
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
