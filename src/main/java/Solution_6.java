public class Solution_6 {
    public static boolean isPowerOfTwo(int value) {
        int a = Math.abs(value);
        return Integer.bitCount(a) == 1;
    }
    public static void main(String[] args) {
        int value = 4;
        System.out.println(isPowerOfTwo(value));
    }
}
