import java.util.Scanner;

public class deleteatbeginarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int n;

        System.out.print("Enter size of the array: ");
        n = scanner.nextInt();

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        n--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
