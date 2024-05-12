import java.util.Scanner;
public class diamondpattern {
    public static void main(String[] args) {
      
      Scanner yu = new Scanner(System.in);
      int n = yu.nextInt();
        // upper part
        for (int i = 1; i <= n; i++) {
            // spcaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            // spcaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
