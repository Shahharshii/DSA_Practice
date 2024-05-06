import java.util.Scanner;

public class pyramidnubers{

    public static void main(String[] args)
    {
        Scanner bc = new Scanner(System.in);
        int n = bc.nextInt();
       for(int i =1; i<=n; i++){
        for(int j= 1; j<=n-i+1;j++)
        {
          System.out.print(j+" ");
        }
        System.out.println();
    }
    }

}



