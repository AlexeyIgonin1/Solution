package Unit5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class InpStream {
    public static void main(String[] args) throws Exception{
        byte[] bytes = new byte[]{48, 49, 50, 51};//создаю и заполняю массив байт
        InputStream inByte = new ByteArrayInputStream(bytes);//создаю поток ввода и передаю ему массив байт

        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));//вывожу в консоль результат работы метода
        inByte.close();//закрываю поток ввода

    }
    public static String readAsString(InputStream inputStream, Charset charset) throws Exception {
        Reader reader = new InputStreamReader(inputStream,charset);//создаю поток для чтения данных с параметрами массива
        //байт и кодировкой
       // BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        String string;
        int a;

        while((a=reader.read()) != -1){
            stringBuilder.append((char)a);//дописываю строку
        }

        return stringBuilder.toString();

    }
}
