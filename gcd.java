import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 0;
        for(int i =1 ; i<=Math.min(num1 , num2); i++){
            if(num1%i==0 && num2%i==0)
             gcd = i;

        }
        System.out.println("GCD is "+gcd);
    }

}

//greatest common divisor
//modulus remainder dekhta hai
