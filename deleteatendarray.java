import java.util.Scanner;

public class deleteatendarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int n;

        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        n--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
