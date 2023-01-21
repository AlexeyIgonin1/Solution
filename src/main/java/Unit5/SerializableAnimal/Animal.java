package Unit5.SerializableAnimal;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable{
   private final String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "Животное зовут " + name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

}
