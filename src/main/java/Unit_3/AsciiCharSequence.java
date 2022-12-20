package Unit_3;


import java.util.Arrays;
import java.util.stream.IntStream;

public class AsciiCharSequence implements CharSequence{
    private byte[] element;

    public AsciiCharSequence(byte[] element){
        this.element = element;

    }

    @Override
    public int length() {
        return element.length;
    }

    @Override
    public char charAt(int index) {
        return (char)element[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(element, start, end));
    }
    //вопрос про нарушение инкапсуляции?
    @Override
    public String toString() {
        return "AsciiCharSequence{" +
                "element=" + Arrays.toString(element) +
                '}';
    }

    //правильный ответ!
     /*@Override
    public String toString() {
        return new String(element);
    }*/

    public static void main(String[] args) {
        byte[] as = new byte[]{2, 4, 7, 9, 56};
        AsciiCharSequence sen = new AsciiCharSequence(as);
        System.out.println(sen.toString());
        System.out.println(sen.length());
        System.out.println(sen.subSequence(1,3));
        System.out.println(sen.charAt(4));

        System.out.println(sen.toString());
        as[0] = 4;
        System.out.println(sen.toString());

    }
}
