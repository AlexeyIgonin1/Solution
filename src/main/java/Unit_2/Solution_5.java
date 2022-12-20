package Unit_2;

public class Solution_5 {
    public static char charExpression(int a) {
        char value = '\\';
        int new_value = value + a;
        return (char)new_value;
    }
    public static void main(String[] args) {
        int a = 28;
        System.out.println(charExpression(a));
    }
}
