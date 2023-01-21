package Unit5.SerializableAnimal;

import java.io.*;

public class WriteAnimal {
    public static void main(String[] args) throws IOException {
        Animal[] animals = new Animal[]{new Animal("Семен"), new Animal("Рыжий"), new Animal("Серый")};
       // ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(animals.length);
        FileOutputStream fileOutputStream = new FileOutputStream("animals.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeInt(animals.length);//Записали в файл длину массива

        for(Animal animal : animals){//прошлись циклом по массиву и записали все в файл
            objectOutputStream.writeObject(animal);
        }
        fileOutputStream.close();//закрыли поток

    }
}
