package Unit5.SerializableAnimal;

import java.io.*;
import java.util.Arrays;

public class ReadAnimal {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("animals.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

           int animalCount =  objectInputStream.readInt();
           Animal[] animals = new Animal[animalCount];

           for(int i = 0; i < animalCount; i++){
              animals [i] = (Animal) objectInputStream.readObject();
           }

            System.out.println(Arrays.toString(animals));

           objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
