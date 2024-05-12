import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        for(int i =1 ; i<=n ; i++){
            //spcaes 
            for (int j =1; j<=n-i;j++){
             System.out.print(" ");
            }
            //1st half 
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half
            for(int j =2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
}
}
