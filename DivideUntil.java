public class DivideUntil {
    public static void main(String[] args) {
        int num = 50;
        while (num >= 10) {
            System.out.print(num + " → ");
            num /= 2;  // Shorthand division
        }
        System.out.println(num);  // Final number
    }
}
