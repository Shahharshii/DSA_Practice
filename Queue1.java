import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
    public static void main(String[] args) {
        Scanner db = new Scanner(System.in);
        Queue<String> q = new ArrayDeque<>();
        System.out.print("Number of students:");
        int noofstudent = db.nextInt();
        for (int i = 1 ; i<=noofstudent;i++){
            String name = db.next();
            q.add(name);
        }
        System.out.print("number of seats: ");
        int noofseats = db.nextInt();
        for (int i = 1 ; i<=noofseats;i++){
          String name = q.remove();
          System.out.println(name+ "  got the seat!!");
        }
    }
  }


