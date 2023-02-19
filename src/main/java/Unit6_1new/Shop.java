package Unit6_1new;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    public static Map<String, Long> getSalesMap(Reader reader){
        Map<String, Long> map = new HashMap<>();
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(reader)){

            while((line = bufferedReader.readLine()) != null){
                String[] keyValuePair = line.split(" ");
                    String key = keyValuePair[0];
                    Long value = Long.valueOf(keyValuePair[1]);
                    if(!map.containsKey(key)){
                        map.put(key, value);
                    }
                    else{
                        map.replace(key, map.get(key), map.get(key)+value);
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return map;
    }

    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("employee.txt");
            System.out.println(getSalesMap(reader));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }




}




