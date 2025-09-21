import java.util.Scanner;
public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Sum: " + (n * (n + 1) / 2));  // Formula: n(n+1)/2
        sc.close();
    }
}
