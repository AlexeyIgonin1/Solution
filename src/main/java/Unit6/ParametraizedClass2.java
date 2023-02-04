public class ParametraizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("String", 3);
        System.out.println("Znacenia pari: value1 =" + pair.getFirstValue()+ "; value2 =" + pair.getSeondValue());
        Pair<Integer, Double> pair2 = new Pair<>(3, 9.0);
        System.out.println("Znacenia pari2: value1 " + pair2.getSeondValue() + " ; value2 = " + pair.getFirstValue());

    }
}
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue(){
        return value1;

    }
    public V2 getSeondValue(){
        return value2;

    }


    class NewPair<V> {
        private V value1;
        private V value2;

        public NewPair(V value1, V value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public V getFirstValue() {
            return value1;

        }

        public V getSeondValue() {
            return value2;

        }
    }

}
