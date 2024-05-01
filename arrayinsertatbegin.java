import java.util.Scanner;

public class arrayinsertatbegin
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] array = new int[n + 1]; // Increase array size by 1

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element at the beginning: ");
        int x = scanner.nextInt();

        // Shift elements to the right
        for (int i = n - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = x;
        n++;

        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
