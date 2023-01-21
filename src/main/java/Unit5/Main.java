
/*
Требуется заменить все вхождения пары символов '\r' и '\n' на один символ '\n'.
Если на входе встречается одиночный символ '\r', за которым не следует '\n', то символ '\r' выводится без изменения.
Кодировка входных данных такова, что символ '\n' представляется байтом 10, а символ '\r' — байтом 13.
Поэтому программа может осуществлять фильтрацию на уровне двоичных данных, не преобразуя байты в символы.

*/

package Unit5;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();
        while(a!=-1){
            int i = System.in.read();
            if(a==13&&i==10){
                System.out.write(a);//записываю переменную в выводной поток
            }
            a=i;
        }
        System.out.flush();// очищаем буфер потока. Дозаписывает то что осталось в потоке. Я правильно понимаю?
    }
}
// правильно. почему?
/*public class Main {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();
        while(a!=-1){
            int i = System.in.read();
            if(a!=13 || i!=10){
                System.out.write(a);
            }
            a=i;
        }
        System.out.flush();
    }
}*/






 /*   // 65 13 10 10 13

    static byte [] b = {65,13,10,10,13};


    public static void main(String[] args) {
        for (byte i : b) {
            System.out.println((char)i + " " + i);
        }
    }
}*/