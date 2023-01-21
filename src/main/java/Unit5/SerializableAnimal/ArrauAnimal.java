package Unit5.SerializableAnimal;

import java.io.*;
import java.util.Arrays;

public class ArrauAnimal {
    public static void main(String[] args) throws ClassNotFoundException {
        byte[] bytes = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeInt(3);
            objectOutputStream.writeObject(new Animal("cat"));
            objectOutputStream.writeObject(new Animal("dog"));
            objectOutputStream.writeObject(new Animal("lion"));

            objectOutputStream.flush();
            bytes = byteArrayOutputStream.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(bytes));
        Animal[] animals = deserializeAnimalArray(bytes);
        System.out.println(Arrays.toString(animals));
    }

    public static Animal[] deserializeAnimalArray(byte[] bytes) throws ClassNotFoundException {
       
       Animal[] animals = new Animal[0];
        try {
            ByteArrayInputStream butes = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(butes);

            int animalCount = objectInputStream.readInt();
            animals = new Animal[animalCount];

            for (int i = 0; i < animalCount; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }

            //System.out.println(Arrays.toString(animals));

            objectInputStream.close();
        } 
        catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

        return animals;
    }

    

}
