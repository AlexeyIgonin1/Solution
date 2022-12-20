package additional_task;

public class Human {

    int age;
    String name;
    String secondName;
    String favoriteSport;

    public Human(){

    }
    public Human(int age, String name, String secondName, String favoriteSport){
        this (age, name, secondName);
        this.favoriteSport = favoriteSport;
    }
    public Human(int age, String name, String secondName){
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", favoriteSport='" + favoriteSport + '\'' +
                '}';
    }

    public static class Main{

        public static void main(String[] args) {
            Human igor = new Human();
            Human ira = new Human(23,"Ira","Popova","pilatos");
            Human ura = new Human(34,"Ura","Ivanov");

            System.out.println(igor);
            System.out.println(ira);
            System.out.println(ura);

        }
    }
}
