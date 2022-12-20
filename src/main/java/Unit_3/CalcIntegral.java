package Unit_3;

import java.util.function.DoubleUnaryOperator;



public class CalcIntegral{
    //метод левых прямоугольников

    public static void main(String[] args) {


        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848

    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {

/*
        double hagi = 10e-7;
        double sum=0;
        while (a<=b){
            a = Math.abs(a+hagi);
            sum+=hagi*f.applyAsDouble(a);
        }
          return sum;
       */

      /*
      double hag = 10e-7;
        double rez = 0;
        while (a<=b){
            a = Math.abs(a+hag);
            double y = f.applyAsDouble(a);
            rez += y;
        }
        return rez*hag;
        */

        double h = 10e-7;
        double res = 0;
        for(double i =a; i<=b; i+=h){
            res += h*f.applyAsDouble(i);
        }
        return res;
    }
}
