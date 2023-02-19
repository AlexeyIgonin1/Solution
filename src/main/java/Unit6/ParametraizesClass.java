package Unit6;

public class ParametraizesClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        Info<String> info2 = new Info<>("poka");
        System.out.println(info1);
        Info<Integer> info3 =  new Info<>(3);
        Info<Integer> info4 = new Info<>(7);
        System.out.println(info4);

    }
}
class Info<T>{
    private T value;

    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }
}
