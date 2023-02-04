import java.util.HashSet;
import java.util.Set;

public class Symmetry {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(0);
        num2.add(1);
        num2.add(2);

        Set<Integer> result = symmetricDifference(num1,num2);
        System.out.println(result);

    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set_1 = new HashSet<T>(set1);
        set_1.addAll(set2);
        System.out.println(set_1);
        Set<T> set_2 = new HashSet<T>(set1);
        set_2.retainAll(set2);
        System.out.println(set_2);
        set_1.removeAll(set_2);
        return set_1;
    }
}
