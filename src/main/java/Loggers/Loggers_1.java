package Loggers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Logger.*;
import java.util.logging.SimpleFormatter;

public class Loggers_1 {
    public static void main(String[] args) {
        Logger NAME = Logger.getLogger(Loggers_1.class.getName());//созали логер
        NAME.setLevel(Level.INFO);//добавили уровень логирования

        ConsoleHandler ch = new ConsoleHandler();//вывод информации логирования в консоль
        NAME.addHandler(ch);

        SimpleFormatter sf = new SimpleFormatter();//формат вывода. присваиваем не логеру на хандлеру
        ch.setFormatter(sf);


        //Логика программы

        NAME.info("Это только начало!!!");



    }
}
