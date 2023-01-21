package Unit_4;

public class Square_root {
    public static double sqrt(double x) {
        if(x<0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }



    public static void main(String[] args) {
        Square_root sqr = new Square_root();

        System.out.println(sqr.sqrt(-2));

    }
}
