import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {9,5,22,64,-1,100};
        for (int i = 0; i < arr.length; i++) {
            int left = 0 ;
            int right = 1;
            while(right<arr.length) {
                if(arr[left]>arr[right]){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right++;

    }
   }
  System.out.println(Arrays.toString(arr));
}
}