package Unit6;

import java.util.ArrayList;
import java.util.List;

public class Test_1 {
    public static void main(String[] args) {
       //List list = new ArrayList();//сырой тип
        List<String> list = new ArrayList<>();

//        list.add("ok");
//        list.add(3);
//        list.add(new Car());

        list.add("privet");
        list.add("poka");
        list.add("pro");
        //list.add(new Car());

        for(Object o : list){
            System.out.println(o + "dlina" + ((String)o).length());

        }
    }

}
class Car{}
