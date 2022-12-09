public class Solution_2 {
    public static int leapYearCount(int year) {
        return (year/4) - (year/100) + (year/400);
    }
    public static void main(String[] args) {
        int year = 56;
        System.out.println(leapYearCount(year));
    }
}
