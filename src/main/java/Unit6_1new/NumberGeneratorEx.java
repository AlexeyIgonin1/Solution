package Unit6_1new;

public class NumberGeneratorEx {
    public static void main(String[] args) {
        System.out.println(getGenerator().cond(0));
    }
    public static NumberGenerator<? super Number> getGenerator() {
        // Unit6_1new.NumberGenerator<Integer> numberGenerator = (x) -> {return x>0};}

        //  Unit6_1new.NumberGenerator<Integer> n = x -> x.intValue()>0;

        return x -> x.intValue()>0;
    }
}

@FunctionalInterface
interface NumberGenerator<T extends Number>{
    boolean cond(T arg);
}
