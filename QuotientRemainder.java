public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println(dividend + " ÷ " + divisor + " = " + quotient + " R" + remainder);  // Output: 10 ÷ 3 = 3 R1
    }
}