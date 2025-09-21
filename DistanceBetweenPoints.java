public class DistanceBetweenPoints {
    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);  // Output: 5.0
    }
}