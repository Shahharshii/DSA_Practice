import java.util.Arrays;

public class secondhighest {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 22, 64, -1, 100 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 2]);
    }
}
