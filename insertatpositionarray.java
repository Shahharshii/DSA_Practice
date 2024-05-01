import java.util.Scanner;

public class insertatpositionarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[20]; // Assuming maximum size is 20

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the insertion location: ");
        int pos = scanner.nextInt();

        System.out.print("Enter the value to be inserted: ");
        int x = scanner.nextInt();

        // Shift elements to the right
        for (int i = n - 1; i >= pos - 1; i--) {
            array[i + 1] = array[i];
        }

        array[pos - 1] = x;
        n++;

        System.out.print("Array after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
