public class SmallestOfFour {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 8, d = 1;
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (d < smallest) smallest = d;
        System.out.println("Smallest: " + smallest);
    }
}