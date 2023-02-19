package Unit6_1new;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unit6 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1, "Vas");
        Employee1 e2 = new Employee1(10, "Nin");
        Employee1 e3 = new Employee1(15, "log");
        Employee1 e4 = new Employee1(13, "Emp");
        Employee1 e5 = new Employee1(7, "Oled");
        Employee1 e6 = new Employee1(3, "Wer");
        List<Employee1> list = new ArrayList<Employee1>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
//        System.out.println(list);
//        Collections.sort(list, new Unit6_1new.idComparator());
        BiConsumer<Employee1, Employee1> biConsumer = (t, u) -> System.out.println(t + " " + u);
        Employee1.findMinMax(list.stream(), new idComparator(), biConsumer);
    }
}

class Employee1{
    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Unit6_1new.Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
    List<T> list1 = new ArrayList<>();

    T min = null;
    T max = null;

    list1 = stream.sorted(order).collect(Collectors.toList());

    if(list1.size()!=0){
        min = list1.get(0);
        max = list1.get(list1.size() - 1);
    }
    minMaxConsumer.accept(min, max);
    }
}

class idComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        if(o1.id == o2.id){
            return 0;
        }
        else if(o1.id > o2.id){
            return 1;
        }
        else{
            return -1;
        }
    }
}