import java.util.Scanner;
public class Numberpyramid {
    public static void main(String[] args) {
        Scanner er = new Scanner(System.in);
        int n   = er.nextInt();
        for(int i = 1 ; i<=n; i++){
            //spaces
            for(int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers 
            for (int j =1 ; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();

        }
    }
}
