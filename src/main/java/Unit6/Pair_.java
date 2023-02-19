package Unit6;

import java.util.Objects;
import java.util.Optional;

public class Pair_ <V1,V2> {
    private V1 value1;
    private V2 value2;

    private Pair_(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirst(){
        return value1;
    }

    public V2 getSecond(){
        return value2;
    }


    public static <V1, V2> Pair_<V1, V2> of (V1 value1, V2 value2) {
        return new Pair_<>(value1, value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair_<?, ?> pair = (Pair_<?, ?>) o;
        return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }





}
