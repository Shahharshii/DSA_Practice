import java.util.Scanner;

public class insertatendarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int n, x;

        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert at the end: ");
        x = scanner.nextInt();
        array[n] = x;
        n++;

        System.out.println("The elements now are:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
