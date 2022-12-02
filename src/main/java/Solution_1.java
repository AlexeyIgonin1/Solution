public class Solution_1 {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int i=0;
        if (a) i++;
        if (b) i++;
        if (c) i++;
        if (d) i++;
        return i == 2;
    }
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        System.out.println(booleanExpression(a,b,c,d));
    }
}
