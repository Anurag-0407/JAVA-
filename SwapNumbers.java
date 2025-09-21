public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before Swap: a=" + a + ", b=" + b);  // a=5, b=10
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a=" + a + ", b=" + b);  // a=10, b=5
    }
}