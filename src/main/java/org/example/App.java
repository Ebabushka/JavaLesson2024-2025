package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){

Person person1 = new Person("Иванов Иван Иванович","05.11.1990", "+78005553535", "Голубой", "Уфа");
Person person2 = new Person("Иванова Ирина Ивановна","24.05.1980", "+783405553535", "Розовый", "Самара");
logger.info(String.format("%s", person1.equals(person2)));
    }
}
