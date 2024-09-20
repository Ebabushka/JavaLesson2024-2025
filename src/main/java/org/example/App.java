package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Программа чтения и вывода информации из файла.
     *
     * @return - возвращает i-ю строку файла
     * @throws IOException - метод исключает IOException
     */
    private static List<String> getStrings() throws IOException {
        List<String> listOfStrings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/example/human.txt"))) {
            String s = new String();
            char ch;
            while (br.ready()) {
                ch = (char) br.read();
                if (ch == '\n') {
                    listOfStrings.add(s.toString());
                    s = new String();
                } else {
                    s += ch;
                }
            }
            if (s.length() > 0) {
                listOfStrings.add(s.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStrings;
    }

    public static void main(String[] args) throws IOException {
        List<String> listOfStrings = getStrings();
        String[] array = listOfStrings.toArray(new String[0]);
        for (String str : array) {
            logger.info(str);
        }
        logger.info(String.format("Сложение: %s", Calculate.addition(23.2, 65.5)));
        logger.info(String.format("Вычетание: %s", Calculate.deduction(25.6, 5.5)));
        logger.info(String.format("Умножение: %.2f", Calculate.multiplication(22.5, -5.6)));
        try {
            logger.info(String.format("Деление: %.2f", Calculate.division(2.0, 0.0)));
        } catch (
                DivisionByZeroError s) {
            logger.info("Деление на 0 невозможно.");
            throw s;
        }
    }
}
