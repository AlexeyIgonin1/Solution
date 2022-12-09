import java.util.function.DoubleUnaryOperator;



public class CalcIntegral {
    //метод левых прямоугольников

    public static void main(String[] args) {


        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848

    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {

      /*  double hag = 10e-7;
        double rez = 0;
        while (a<=b){
            a = Math.abs(a+hag);
            rez = a*f.applyAsDouble(a);
        }
        return rez;*/

        double n = 10000000;
        double h = Math.abs(a-b/n);
        double res = 0;

        for(double i =0; i<n; i++){
            res = f.applyAsDouble(a + h*i);
        }


        return res;
    }


}
