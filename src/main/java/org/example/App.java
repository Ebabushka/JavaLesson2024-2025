package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Задание №1: Меньшее из трех чисел с помощью if;
     * a, b, c - значения чисел.
     */
    public static Integer minimalNumber(Integer a, Integer b, Integer c) {
        if (a < b && a < c) {
            return a;
        } else {
            if (b < a && b < c) {
                return b;
            } else {
                return c;
            }
        }
    }

    /**
     * Задание №2: Определить, является ли год високосным. (год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400);
     * year - год, проверяемый на то високосный он или нет.
     */
    public static String whatIsCalendarYear(Integer year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return String.format("%s год является високосным", year);
        } else {
            return String.format("%s год не является високосным", year);
        }
    }

    /**
     * Задание №3: Вывести значение функции: (4*(x - 5)^2 + 7*x – 10)/(x^4+1).
     * x, y - Корни уравнений.
     */
    public static Double functionValue(Integer x) {
        Double y = ((4 * Math.pow((x - 5), 2) + 7 * x - 10) / (Math.pow(x, 4) + 1));
        return y;
    }

    /**
     * Задание №4: По точке (x,y) определить четверть.
     * x, y - координаты точек по осям координат.
     */
    public static String defineQuarter(Double x, Double y) {
        if (x > 0 && y > 0) {
            return String.format("Точка с координатами (%s, %s) лежит в I четверти", x, y);
        } else {
            if (x < 0 && y > 0) {
                return String.format("Точка с координатами (%s, %s) лежит во II четверти", x, y);
            } else {
                if (x < 0 && y < 0) {
                    return String.format("Точка с координатами (%s, %s) лежит в III четверти", x, y);
                } else {
                    return String.format("Точка с координатами (%s, %s) лежит в IV четверти", x, y);
                }
            }
        }
    }

    /**
     * Задание №5: Существует ли треугольник по трём сторонам.
     * a, b, c - стороны треугольника;
     */
    public static String existenceTriangle(Double a, Double b, Double c) {
        if (a < b + c && b < a + c && c < a + b) {
            return String.format("Треугольник существует");
        } else {
            return String.format("Треугольник не существует");
        }
    }

    /**
     * Задание №6*: Решить квадратное уравнение a*x^2 + b*x + c = 0 имея a,b,c ответ вывести в строку.
     * a, b - коэфициенты квадратного уравнения; с - свободный член. D - дискриминант.
     */
    public static String quadraticEquation(Double a, Double b, Double c) {
        Double D = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            Double x = -c / b;
            return String.format("Корень квадратного уравнения: x = %s", x);
        } else {
            if (D == 0) {
                Double x = -b / (2 * a);
                return String.format("\nДискриминант: D = %s, \nКорень квадратного уравнения: x = %s", D, x);
            } else {
                if (D > 0) {
                    Double x1 = (-b + Math.sqrt(D)) / (2 * a);
                    Double x2 = (-b - Math.sqrt(D)) / (2 * a);
                    return String.format("Дискриминант: D = %s; \nКорни квадратного уравнения: \nx1 = %s, \nx2 = %s", D, x1, x2);
                } else {
                    return "Нет действительных корней";
                }
            }
        }
    }

    /**
     * Задание №7*:
     * Закончить фразу “У меня в кармане...” одним из возможных продолжений: “n монет”, “n монета”, “n монеты” 0 <= n <= 100.
     * numbersOfCoins - число монет.
     */
    public static String declensionNumber(Integer numbersOfCoins) {
        if (numbersOfCoins % 10 == 1 && (numbersOfCoins / 10) % 10 != 1) {
            return String.format("У меня в кармане %s монета", numbersOfCoins);
        } else {
            if ((numbersOfCoins % 10) == 0 || numbersOfCoins % 10 > 0 && (numbersOfCoins / 10) % 10 == 1 || numbersOfCoins % 10 >= 5) {
                return String.format("У меня в кармане %s монет", numbersOfCoins);
            } else {
                return String.format("У меня в кармане %s монеты", numbersOfCoins);
            }
        }
    }

    /**
     * Задание №8*: Упорядочить три числа по возрастанию.
     * a, b, c - числа в произвольном порядке;
     * minValue - минимальное значение; averageValue - среднее значение, maxValue - максимальное значение.
     */
    public static String arrangeTheNumbers(Integer a, Integer b, Integer c) {
        Integer minValue, averageValue, maxValue;
        if (a > b && a > c) {
            maxValue = a;
            if (b > c) {
                minValue = c;
                averageValue = b;
            } else {
                minValue = b;
                averageValue = c;
            }
        } else {
            if (b > a && b > c) {
                maxValue = b;
                if (a > c) {
                    minValue = c;
                    averageValue = a;
                } else {
                    minValue = a;
                    averageValue = c;
                }
            } else {
                maxValue = c;
                if (a > b) {
                    minValue = b;
                    averageValue = a;
                } else {
                    minValue = a;
                    averageValue = b;
                }
            }
        }
        return String.format("Ответ в порядке возрастания: %s, %s, %s", minValue, averageValue, maxValue);
    }

    public static void main(String[] args) {
        logger.info(String.format("\nЗадание №1: Минимальное значение: %s.\n", minimalNumber(4, 8, 2)));
        logger.info(String.format("\nЗадание №2: Ответ: %s.\n", whatIsCalendarYear(2007)));
        logger.info(String.format("\nЗадание №3: Ответ: y = %.3f.\n", functionValue(25)));
        logger.info(String.format("\nЗадание №4: Ответ: %s.\n", defineQuarter(2.1, 4.4)));
        logger.info(String.format("\nЗадание №5: Ответ: %s.\n", existenceTriangle(2.5, 4.0, 5.2)));
        logger.info(String.format("\nЗадание №6*: Ответ: %s.\n", quadraticEquation(4.0, 8.0, -5.0)));
        logger.info(String.format("\nЗадание №7*: Ответ: %s.\n", declensionNumber(4)));
        logger.info(String.format("\nЗадание №8*: %s.\n", arrangeTheNumbers(12, 6, 9)));
    }
}

