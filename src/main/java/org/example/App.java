package org.example;

import org.example.Human.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Human[] human = {
                new Human("Павлов Петр Евгеньевич", 25),
                new Human("Шукшин Степан Ярославович", 32),
                new Human("Семипалов Елизавета Геннадиевна", 29),
                new Human("Абдуланон Саид Мурадович", 19)
        };

        Work[] work = new Work[]{
                new Engineer("Инженер"),
                new Cook("Повар"),
                new Doctor("Доктор"),
                new Loader("Грузчик")
        };
        for (int i = 0; i < work.length; i++) {
            logger.info(String.format("%s %s",human[i].human(), work[i].post()));
        }
    }
}

