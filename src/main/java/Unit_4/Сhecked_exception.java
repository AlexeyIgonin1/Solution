package Unit_4;

public class Сhecked_exception {
    public static void main(String[] args) {

    }
    public void testExp() {
        throw new MyNewException("new");

    }
    class MyNewException extends RuntimeException{
        public MyNewException(String message){
            super(message);
        }
    }
}
