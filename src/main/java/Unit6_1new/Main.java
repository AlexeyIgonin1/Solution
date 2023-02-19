package Unit6_1new;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String strTest1 = "Мама мыла-мыла-мыла раму!";

        String strTest2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus " +
                "at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit " +
                "blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget " +
                "vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Integer vel odio nec mi tempor dignissim.";

        BufferedReader bf = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(strTest1.getBytes()),
                StandardCharsets.UTF_8));

        Map<String, Integer> result = new HashMap<>();


      bf.lines().flatMap(w -> Stream.of(w.split("[\\p{Punct}\\s]+"))).
                map(x -> x.toLowerCase()).
                forEach(t -> {
                    if (result.containsKey(t)) result.put(t, result.get(t) + 1);
                else result.put(t, 1);});

        //System.out.println(result);


        result.entrySet().stream().sorted((e1, e2) -> {
            if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                else return e2.getValue().compareTo(e1.getValue());}).
                limit(10).
                forEach(e -> System.out.println(e.getKey()));
    }
}
