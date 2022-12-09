public class Solution_7 {
    public static boolean isPalindrome(String text) {
       String s2 = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder s3 = new StringBuilder(s2).reverse();
        //boolean answer = s3.toString().equalsIgnoreCase(s2);
        return s3.toString().equalsIgnoreCase(s2);
    }
    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";
        System.out.println(isPalindrome(text));
    }
}
