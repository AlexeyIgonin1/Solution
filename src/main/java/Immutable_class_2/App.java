package Immutable_class_2;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key","value");

        // Инициализация нашего "иммутабельного" класса
        MutableClass mutable = new MutableClass("this is not immutable", map);

        // Мы не можем изменять состояние объекта
        // через добавление элементов в полученную map
        System.out.println("Результат после модификации карты после того, как мы получим ее от объекта");
        mutable.getFieldMap().put("bad key", "another value");
        mutable.getFieldMap().keySet().forEach(e -> System.out.println(e));

        System.out.println("Результат карты объекта после модификации исходной карты");
        map.put("bad key", "another value");
        mutable.getFieldMap().keySet().forEach(e -> System.out.println(e));

    }
}
