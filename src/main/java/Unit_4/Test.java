package Unit_4;

public class Test {
    public static void main(String[] args) {
       // System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
       // System.out.println(getCallerClassAndMethodName());
        getCallerClassAndMethodName();
    }

    public static void getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for(StackTraceElement info : stackTraceElements){

            System.out.println(info);
        }

        /*
        if (stackTraceElements.length >= 3) {
            StackTraceElement element = stackTraceElements[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            message = className + ": " + methodName;
            System.out.println(message);
        }*/


    }
}
