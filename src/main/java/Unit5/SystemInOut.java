package Unit5;

import java.io.Reader;
import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0.0;
        int i = 0;
//выйти из цикла Ctrl+Fn+d
        try {
            while (scanner.hasNext()) {    // Цикл прверяет есть ли на входе еще одно слово
                if (scanner.hasNextDouble()) {  //условие проверяет что на входе тип double

                  //a += scanner.nextDouble(); // Так же считает не пойму в чем разница?
                    a += Double.parseDouble(scanner.next());
                } else {
                    scanner.next();//если число не подходит то берем слеующий токен
                }
            }
            System.out.println(a);
            System.out.printf("%.6f", a);
        }

    catch(Exception e) {
        System.out.println("Ошибка!");
    }
    }

}
