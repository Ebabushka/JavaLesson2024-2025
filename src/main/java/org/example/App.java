package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.antity.Person;
import org.example.antity.Calculator;
import java.time.LocalDate;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        Person person = new Person("Владимир","Вистаковский", LocalDate.of(2000,2,28));
        person.setMiddleName("Вятчеславович");
        person.setCitizenship("Беларусь");
        person.setGender("Мужской");
        //Рост в метрах
        person.setHeight(50.0);
        //Вес в килограммах
        person.setWeight(800.0);
        logger.info(String.format("Имя: %s", person.getName()));
        logger.info(String.format("Фамилия: %s", person.getSurname()));
        logger.info(String.format("Отчество: %s", person.getMiddleName()));
        logger.info(String.format("Дата: %s", person.getDateOfBirth()));
        logger.info(String.format("Гражданство: %s", person.getCitizenship()));
        logger.info(String.format("Пол: %s", person.getGender()));
        logger.info(String.format("Рост: %s", person.getHeight()));
        logger.info(String.format("Вес: %s", person.getWeight()));
        logger.info(String.format("Возраст: %s", person.getAge()));
        //калькулятор
        logger.info(String.format("Сложение: %s", Calculator.addition(23.2,65.5)));
        logger.info(String.format("Вычетание: %s", Calculator.deduction(25.6,5.5)));
        logger.info(String.format("Сложение: %.2f", Calculator.multiplication(22.5,-5.6)));
        logger.info(String.format("Сложение: %.2f", Calculator.division(21.5,2.3)));


    }
}
