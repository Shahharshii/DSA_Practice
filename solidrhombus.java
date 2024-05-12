import java.util.Scanner;

public class solidrhombus {
    public static void main(String[] args) {
     
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        for(int i = 1; i<=n; i++){
            //spaces 
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
