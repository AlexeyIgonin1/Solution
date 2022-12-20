package Unit_2;

public class Solution_3 {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        System.out.println(doubleExpression(a,b,c));
    }
}
