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
        logger.info(String.format("%s", human[0].human1()));
        logger.info(String.format("%s", human[1].human2()));
        logger.info(String.format("%s", human[2].human3()));
        logger.info(String.format("%s", human[3].human4()));
    }
}


