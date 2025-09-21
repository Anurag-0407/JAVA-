import java.util.Scanner;
public class SumEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = (n / 2) * (n / 2 + 1);  // Formula for sum of evens
        System.out.println("Sum of evens: " + sum);  // e.g., N=10 → Sum=30
        sc.close();
    }
}