package SerializableObject;

import SerializableObject.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args)  {
        Person person1 = new Person(1, "Dep");
        Person person2 = new Person(2, "Sem");// создали экземпляры объета

        try {
            FileOutputStream file = new FileOutputStream("people.bin"); //создали место куда будем сохранять наши объекты
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);// выбрасывает еще иск. IOException(проверяемое)
            objectOutputStream.writeObject(person1);//пишем в файл
            objectOutputStream.writeObject(person2);

            objectOutputStream.close(); //закрываем поток
        } catch (FileNotFoundException e) { //выбрасываеться исключение если такого файла не существует
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
