package Unit_4;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(test2());
        test();
    }
    public static void test(){
        System.out.println(test2());
        //test2();


    }

    public static String test2() {

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        if (stackTraceElement.length <= 3) {
            return null;
            // System.out.println(stackTraceElement[2].getClassName() + "#" + stackTraceElement[2].getMethodName());
        }

        return stackTraceElement[3].getClassName() + "#" + stackTraceElement[3].getMethodName();


    }





}
