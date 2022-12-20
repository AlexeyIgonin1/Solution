package Unit_2;

public class Solution_4 {
    public static int flipBit(int value, int bitIndex) {
        return value^(1<<(bitIndex-1));
    }
    public static void main(String[] args) {
        int value = 0;
        int bitIndex = 1;
        System.out.println(flipBit(value,bitIndex));
    }
}
