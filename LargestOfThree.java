
public class LargestOfThree {
   public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    } 
}
