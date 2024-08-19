package org.example;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Задание №1: Написать функцию которая принимает 3 значения (длина, минимально-возможное значение массивая,
     * максимально-возможное значение массива) и выводит рандомно сгенерированный массив.
     *
     * @param length    - Длина массива;
     * @param minNumber - минимально-возможное значение массива;
     * @param maxNumber - максимально-возможное значение массива;
     * @return - возвращает массив рандомных чисел по трем вводным, длине, минимальному и максимальному значению массива.
     */
    public static int[] generateArray(int length, int minNumber, int maxNumber) {
        int[] massive = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            massive[i] = random.nextInt(maxNumber - minNumber) + minNumber;
        }
        return massive;
    }

    /**
     * Задание №1.1: Выведение массива на печать.
     *
     * @param massive - массив случайных чисел, используемый для конвертации формата;
     * @return - возвращает преобразованный в текстовый формат для печати массив.
     */
    public static String arrayToString(int[] massive) {
        StringBuilder stringMassive = new StringBuilder();
        for (int i = 0; i < massive.length; i++) {
            stringMassive.append(massive[i]).append(" ");
        }
        return stringMassive.toString();
    }

    /**
     * Задание №2: Отсортировать массив с помощью пузырка.
     *
     * @param massive - массив случайных чисел;
     * @return - возвращает отсортированный массив.
     */
    public static int[] bubbleSort(int[] massive) {
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j < massive.length - i - 1; j++) {
                if (massive[j + 1] < massive[j]) {
                    int swap = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = swap;
                }
            }
        }
        return massive;
    }

    /**
     * Задание №3: Найти сумму всех элементов массива.
     *
     * @param massive - массив случайных чисел;
     * @return - возвращает сумму элементов массива.
     */
    public static int sumElMassive(int[] massive) {
        int sumResult = 0;
        for (int i = 0; i < massive.length; i++) {
            sumResult = sumResult + massive[i];
        }
        return sumResult;
    }

    /**
     * Задание №4: Вывести все четные элементы массива.
     *
     * @param massive - массив случайных чисел;
     * @return - возвращает массив четных чисел.
     */
    public static int[] evenElMassive(int[] massive) {
        int counter = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                counter++;
            }
        }
        int[] evenMassive = new int[counter];
        int j = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                evenMassive[j] = massive[i];
                j++;
            }
        }
        return evenMassive;
    }

    /**
     * Задание №5 и №8*: Удалить первый элемент массива / Удалить элемент из массива по индексу.
     *
     * @param massive     - массив случайных чисел;
     * @param deleteIndex - Индекс массива, который необходимо удалить вместе со значением;
     * @return - возвращает новый массив, с исключённым из него значением заданного индекса.
     */
    public static int[] deleteIndexArray(int[] massive, int deleteIndex) {
        int[] newMassive = new int[massive.length - 1];
        for (int i = 0; i < massive.length - 1; i++) {
            if (i < deleteIndex) {
                newMassive[i] = massive[i];
            } else {
                if (i >= deleteIndex) {
                    newMassive[i] = massive[i + 1];
                }
            }
        }
        return newMassive;
    }

    /**
     * Задание №7: Вывести строку задом наоборот.
     *
     * @param line - Исходная строка;
     * @return - возвращает отреверсированный формат строки;
     */
    public static String reverseLine(String line) {
        char[] charMassive = line.toCharArray();
        for (int i = 0; i < charMassive.length / 2; i++) {
            char temp = charMassive[i];
            charMassive[i] = charMassive[charMassive.length - i - 1];
            charMassive[charMassive.length - i - 1] = temp;
        }
        return new String(charMassive);
    }

    /**
     * Задание №8: Отсортировать массив по возрастанию с помощью быстрой сортировки.
     *
     * @param massive    - массив случайных чисел;
     * @param startValue - индекс крайнего левого элемента массива;
     * @param endValue   - индекс крайнего правого элемента массива;
     */
    public static void quickSort(int[] massive, int startValue, int endValue) {
        int midElMassive = startValue + ((endValue - startValue) / 2);
        int leftElMassive = startValue;
        int rightElMassive = endValue;
        while (leftElMassive <= rightElMassive) {
            while (massive[leftElMassive] < massive[midElMassive]) {
                leftElMassive++;
            }
            while (massive[rightElMassive] > massive[midElMassive]) {
                rightElMassive--;
            }
            if (leftElMassive <= rightElMassive) {
                int swap = massive[rightElMassive];
                massive[rightElMassive] = massive[leftElMassive];
                massive[leftElMassive] = swap;
                leftElMassive++;
                rightElMassive--;
            }
            if (rightElMassive > startValue) {
                quickSort(massive, startValue, rightElMassive);
            }
            if (leftElMassive < endValue) {
                quickSort(massive, leftElMassive, endValue);
            }
        }
    }

    /**
     * Продолжение задания №8: Отсортировать массив по возрастанию с помощью быстрой сортировки.
     *
     * @param massive - массив случайных чисел.
     * @return
     */
    public static int[] quickSort(int[] massive) {
        quickSort(massive, 0, massive.length - 1);
        return massive;
    }

    /**
     * Задание №9: У нас есть последовательност 1+2+3+...+n, определить существует ли такое n, чтобы сумма ряда была кратна числу k,
     * написать функцию, в которую передают только число k и получают ответ: true либо false.
     *
     * @param k - делитель;
     * @return - возвращает true при нахождении числа n кратного k;
     */
    public static boolean numericalSequence(int k) {
        int n = 1;
        for (int i = 1; i <= n; i++) {
            n = n + i;
            while (n % k == 0) {
            }
        }
        return true;
    }

    public static void main(String[] args) {
        logger.info(String.format("\nЗадание №1: \nМассив: %s\n", arrayToString(generateArray(5, 1, 20))));
        logger.info(String.format("\nЗадание №2: \nОтсортированный массив: %s\n", arrayToString(bubbleSort(generateArray(5, 1, 20)))));
        logger.info(String.format("\nЗадание №3: \nСумма элементов массива: %s\n", sumElMassive(generateArray(5, 1, 20))));
        logger.info(String.format("\nЗадание №4: \nМассив четных чисел: %s\n", arrayToString(evenElMassive(generateArray(5, 1, 20)))));
        logger.info(String.format("\nЗадание №5: \nНовый массив: %s\n", arrayToString(deleteIndexArray(generateArray(5, 1, 20), 0))));
        logger.info(String.format("\nЗадание №7: \nРеверсированный массив: %s\n", reverseLine("нодногя")));
        logger.info(String.format("\nЗадание №8: \nОтсортированный массив: %s\n", arrayToString(quickSort(generateArray(5, 1, 20)))));
        logger.info(String.format("\nЗадание №9: \nОтвет: %s\n", numericalSequence(15)));
    }
}

