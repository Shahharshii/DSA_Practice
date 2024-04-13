public class highlow {
    public static void main(String[] args) {
        int[] arr = {-5,2,4,6,56,1000,898};
        int highest = -99999999;
        int lowest = 999999999;
        for (int element: arr) {
            if (element > highest) {
                highest = element;
            }
            if (element < lowest) {
                lowest = element;
            }
    
    }
    int difference = highest - lowest;
    System.out.println("Difference  is " +difference);
}
}
