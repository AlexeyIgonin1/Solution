package Unit5;
import java.io.*;


public class Main2 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[]{0x33, 0x45, 0x01};//создал массив байт
        InputStream inputStream;//создал поток ввода
        inputStream = new ByteArrayInputStream(bytes);
        System.out.println(checkSumOfStream(inputStream));


    }
    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        int result =0;
        int b;
        while((b = inputStream.read())!=-1){
            result = Integer.rotateLeft(result, 1)^b;
        }
        return result;
    }
}
