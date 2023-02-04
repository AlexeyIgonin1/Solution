import java.util.Objects;
import java.util.Optional;

public class Pair <V1,V2> {
    private V1 value1;
    private V2 value2;

    private Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirst(){
        return value1;
    }

    public V2 getSecond(){
        return value2;
    }


    public static <V1, V2> Pair<V1, V2> of (V1 value1, V2 value2) {
        return new Pair<>(value1, value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }





}
