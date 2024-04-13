import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("hello world!");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i =0; i<n ;i++){
            for(int j=0; j<n; j++){
             System.out.print("*");
            }
            System.out.println("");
         }
    }
}

//patterns 
//box mai print star karne k liye using user input