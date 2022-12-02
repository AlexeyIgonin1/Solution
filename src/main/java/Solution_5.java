public class Solution_5 {
    public static char charExpression(int a) {
        char value = '\\';
        int newvalue = value + a;

        return (char)newvalue;
    }
    public static void main(String[] args) {
        int a = 28;
        System.out.println(charExpression(a));
    }
}
