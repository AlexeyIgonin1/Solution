import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exep2 {
    public static void main(String[] args) throws IOException {
        //создаем объект класса InputStreamReader и передаем ему входящий поток, из которого он должен считывать данные.
        //InputStreamReader не только получает данные из потока. Он еще и преобразует байтовые потоки в символьные
       // BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

      while(i<2) {
          int b = System.in.read();//читаем данные с клавиатуры. Читает только байты
          System.out.println(b);// вывод будет три байта первые два это байты самого символа
                               //а третий это байт переноса строки
          i++;
      }

    }
}
