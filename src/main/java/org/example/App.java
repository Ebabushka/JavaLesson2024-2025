package org.example;

import java.util.Random;

public class App {
    /**
     * Задание №1: Написать функцию которая принимает 3 значения (длина, минимально-возможное значение массивая,
     * максимально-возможное значение массива) и выводит рандомно сгенерированный массив.
     *
     * @param length    - Длина массива;
     * @param minNumber - минимально-возможное значение массива;
     * @param maxNumber - максимально-возможное значение массива;
     */
    public static int[] createMassive(int length, int minNumber, int maxNumber) {
        int[] massive = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            massive[i] = random.nextInt(maxNumber - minNumber) + minNumber;
        }
        return massive;
    }

    /**
     * Выведение печати масива.
     */
    public static String printMassive(int[] massive) {
        StringBuilder stringMassive = new StringBuilder();
        for (int i = 0; i < massive.length; i++) {
            stringMassive.append(massive[i]).append(" ");
        }
        return stringMassive.toString();
    }

    /**
     * Задание №2: Отсортировать массив с помощью пузырка.
     * swap - Переменная запоминающая минимальное и максимальное значение массива.
     */
    public static String bubbleSort(int[] massive) {
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j < massive.length - i - 1; j++) {
                if (massive[j + 1] < massive[j]) {
                    int swap = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = swap;
                }
            }
        }
        return printMassive(massive);
    }

    /**
     * Задание №3: Найти сумму всех элементов массива.
     * sumResult - Сумма всех элементов массива.
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
     */
    public static void evenElMassive(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                System.out.println(String.format("Индекс: %s; Четный эл.массива: %s", i, massive[i]));
            }
        }
    }

    /**
     * Задание №5 и №8*: Удалить первый элемент массива / Удалить элемент из массива по индексу.
     * massive - Исходный массив;
     * newMassive - Массив с исключенным индексом.
     * delete index - Индекс, который требуется удалить из массива.
     */
    public static String deleteFirstElMassive(int[] massive) {
        int[] newMassive = new int[massive.length - 1];
        int deleteIndex = 0;
        for (int i = 0; i < massive.length - 1; i++) {
            if (i < deleteIndex) {
                newMassive[i] = massive[i];
            } else {
                if (i >= deleteIndex) {
                    newMassive[i] = massive[i + 1];
                }
            }
        }
        return printMassive(newMassive);
    }

    /**
     * Задание №7: Вывести строку задом наоборот;
     * massive - Исходный массив;
     * newMassive - Реверсированный массив.
     */
    public static String reverseMassive(int[] massive) {
        int[] newMassive = new int[massive.length];
        newMassive[0] = massive[massive.length - 1];
        for (int i = 0; i < massive.length - 1; i++) {
            newMassive[massive.length - i - 1] = massive[i];
        }
        return printMassive(newMassive);
    }

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
     * Задание №8: Отсортировать массив по возрастанию с помощью быстрой сортировки.
     */
    public static void quickSortTest(int[] massive) {
        quickSort(massive, 0, massive.length - 1);
        System.out.println(String.format("Отсортированный массив: %s", printMassive(massive)));
    }

    /**
     * Задание №9: У нас есть последовательност 1+2+3+...+n, определить существует ли такое n, чтобы сумма ряда была кратна числу k,
     * написать функцию, в которую передают только число k и получают ответ: true либо false.
     * firstElSequence - нижняя граница числовой последовательности / делимое.
     * n - верхняя граница числовой последовательности;
     *
     * @param k - делитель.
     */
    public static boolean numericalSequence(int k) {
        int firstElSequence = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            firstElSequence = firstElSequence + i;
        }
        if (firstElSequence % k == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(String.format("Задание №1: \nМассив: %s", printMassive(createMassive(5, 1, 20))));
        System.out.println(String.format("Задание №2: \nОтсортированный массив: %s", bubbleSort(createMassive(5,1,20))));
        System.out.println(String.format("Задание №3: \nСумма элементов массива: %s", sumElMassive(createMassive(5,1,20))));
        System.out.println(String.format("Задание №4:"));
        evenElMassive(createMassive(5,1,20));
        System.out.println(String.format("Задание №5: \nНовый массив: %s", deleteFirstElMassive(createMassive(5, 1, 20))));
        System.out.println(String.format("Задание №7: \nРеверсированный массив: %s", reverseMassive(createMassive(5, 1, 20))));
        System.out.println(String.format("Задание №8:"));
        quickSortTest(createMassive(5, 1, 20));
        System.out.println(String.format("Задание №9: \nОтвет: %s", numericalSequence(2)));
    }
}

