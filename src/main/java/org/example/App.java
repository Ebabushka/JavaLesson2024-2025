package org.example;

import org.example.Human.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Human[] human = {
                new Human("Павлов Петр Евгеньевич", 25, "Инженер", new Engineer(new Document("Диплом о высшем образовании инженера", 2568, 148967))),
                new Human("Шукшин Степан Ярославович", 32, "Повар", new Cook(new Document("Медицинская книжка", 4876, 287648))),
                new Human("Семипалов Елизавета Геннадиевна", 29, "Доктор", new Doctor(new Document("Диплом о высшем образовании терапевта", 5914, 894756), new Document("Медицинская книжка", 8963, 896742))),
                new Human("Абдуланон Саид Мурадович", 19, "Грузчик", new Loader())

        };
        for (int i = 0; i < human.length; i++) {
            logger.info(String.format("%s", human[i].human()));
        }
    }
}


