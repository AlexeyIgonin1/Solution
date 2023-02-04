import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Exeption {
    public static void main(String[] args) {
        Collection<?> collection = new HashSet<Object>();
        Object object = new Object();
        int a = 6;
        a+=6;
        System.out.println(a);
       // collection.addAll(Arrays.asList(object));

        //collection.add(object);

        collection.size();

        collection.clear();

        collection.remove(object);

        collection.iterator();

        collection.toArray();

        collection.contains(object);
    }
}
