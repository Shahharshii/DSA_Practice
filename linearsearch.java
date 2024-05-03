import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int n, x;

        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search in array: ");
        x = scanner.nextInt();

        int i;
        for (i = 0; i < n; i++) {
            if (array[i] == x) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (i == n) {
            System.out.println("Element not found in array");
        }

       
    }
}
