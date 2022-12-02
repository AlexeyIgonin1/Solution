public class Solution_2 {
    public static int leapYearCount(int year) {
        int ves_1 = year/4;
        int noy = year/100;
        int ves_2 = year/400;
        return ves_1 - noy + ves_2;
    }
    public static void main(String[] args) {
        int year = 56;
        System.out.println(leapYearCount(year));
    }
}
