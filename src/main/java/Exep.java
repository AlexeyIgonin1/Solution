public class Exep {
    public static void main(String[] args) throws CloneNotSupportedException {
    //iskl(5,0);
        // iskluchenia(2,0);
    //notGood();
  //iskSprov(10,0);
       try{
            iskProbros(3,3);
        }


        catch(ArithmeticException e){
            System.out.println("На ноль делить нельзя!!!");
        }
       catch(Exception e){


       }
       //proverIsk(3,5);
        hereWillBeTrouble();

    }

    public static void iskl(int a, int b){
        System.out.println("Метод начал рабтать");
        int h = a/b;
        System.out.println("Результат= " + h);
        System.out.println("Метод закончил работать");
    }

    public static void iskluchenia(int a, int b){
        System.out.println("Начало работы метода");

        try{
            System.out.println("До исключения");
            int c = a/b;
            System.out.println(c);
            System.out.println("ПОСЛЕ ВЫБРАСЫВАНЯИ ИСКЛЮЧЕНИЯ");
        }
        catch(ArithmeticException e){
            System.out.println("Говорили же не дели на ноль");
        }
        System.out.println("Метод отработал");
    }
    static void notGood(){
        System.out.println("Только не снова!!!!");
        notGood();
    }

    public static void iskSprov(int a, int b){
        if(b==0){
            throw new ArithmeticException("Ты опять делишь на ноль!! Хватит!!!");
        }
        int s = a/b;
        System.out.println(s);
        System.out.println("Метод отработал");
    }
    //Перебросил метод по стеку выше
    public static void iskProbros(int a, int b) throws ArithmeticException{
        System.out.println("Начало метода");
        int w = a/b;
        System.out.println("Равно =" + w);
        System.out.println("Метод закончился");
    }
    //Проверяемые исключение как делать
    public static void proverIsk(int a, int b) throws CloneNotSupportedException{
        System.out.println("Начало метода!");
       // throw new CloneNotSupportedException();

    }
    private static void hereWillBeTrouble() throws CloneNotSupportedException {
        System.out.println("Я не буду ничего кидать, не просите");
    }
}
