package Unit5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Writer {
    public static void main(String[] args) throws IOException {
        OutputStream outs = new FileOutputStream("2.txt");
        //почему не работает?
      //  Writer writer = new OutputStreamWriter(outs, StandardCharsets.US_ASCII);
       // writer.write("первый");
        //writer.flush();

        InputStream input = new FileInputStream("2.txt");
        System.out.println(input.read());


    }

}
