package Unit6_1new;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
    public static void main(String[] args) {
        UnaryOperatorEx unaryOperatorEx = new UnaryOperatorEx();

        System.out.println(unaryOperatorEx.sqrt().apply(5));
    }
    public UnaryOperator sqrt(){
        UnaryOperator<Integer> sqr = (x -> x*x);
        return sqr;
    }
}
