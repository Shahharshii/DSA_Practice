import java.util.Scanner;

public class invertpyramid {
    public static void main(String[] args)
    {
        Scanner bc = new Scanner(System.in);
        int n = bc.nextInt();
       for(int i = n; i>=0; i--){
        for (int j = 0; j<i; j++) {
            System.out.print("*");
 
       }
       System.out.println(" ");
    }
    }
}
