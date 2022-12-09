import java.math.BigInteger;

public class Solution_8 {
    public static BigInteger factorial(int value) {
        BigInteger res= new BigInteger("1");
        for(int a = 1; a <= value; a++){
            res=res.multiply(BigInteger.valueOf(a));
        }
        return res;
    }
    public static void main(String[] args) {
        int value= 5;
        System.out.println(factorial(value));
    }
}
