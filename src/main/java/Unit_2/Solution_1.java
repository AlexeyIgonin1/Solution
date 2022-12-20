package Unit_2;

public class Solution_1 {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a^b)&&(c^d))||((a^d)&&(c^b));
    }
    public static void main(String[] args){
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        System.out.println(booleanExpression(a,b,c,d));
    }
}
