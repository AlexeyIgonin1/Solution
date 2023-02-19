package Test;

public class Test1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        //System.out.println(a==b);
        int c = 4;
        int n = 5;
        //System.out.println(c==n);
        Animal animal = new Animal(12);
        Animal animal2 = new Animal(11);
        //System.out.println(animal==animal2);

        Object object = new Object();
        object.equals(object);
        //System.out.println(object.equals(object));

        System.out.println(animal.equals(animal2));

    }
}

class Animal{
    int age;

    Animal(int age){
        this.age = age;
    }
    public boolean equals(Object o){
        Animal animal = (Animal) o;
        return this.age == animal.age;
    }


}
