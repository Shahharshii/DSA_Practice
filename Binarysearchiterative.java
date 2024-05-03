 import java.util.Scanner;

public class Binarysearchiterative{
    static int[] array = new int[20];
    static int n, x;

    static int binarySearch(int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == x) {
                return mid;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();

        System.out.print("Enter the elements in ascending order: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search in array: ");
        x = scanner.nextInt();

        int result = binarySearch(0, n - 1);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }
}
 