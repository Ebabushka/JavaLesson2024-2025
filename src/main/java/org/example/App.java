package org.example;

public class App {
    public static void task_1(Integer a, Integer b, Integer c) {
        /**
         * Задание №1: Меньшее из трех чисел с помощью if;
         * a, b, c - значения чисел.
         */
        if (a < b && a < c) {
            System.out.println(String.format("Задание №1:\nНаименьшее из чисел: %s.", a));
        } else {
            if (b < a && b < c) {
                System.out.println(String.format("Задание №1:\nНаименьшее из чисел: %s.", b));
            } else {
                System.out.println(String.format("Задание №1:\nНаименьшее из чисел: %s.", c));
            }
        }
    }

    public static void task_2(Integer year) {
        /**
         * Задание №2: Определить, является ли год високосным. (год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400);
         * year - год, проверяемый на то високосный он или нет.
         */
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(String.format("Задание №2: \nГод %s - является вискокосным.", year));
        } else {
            System.out.println(String.format("Задание №2: \nГод %s - не является вискокосным.", year));
        }
    }

    public static void task_3(Integer x) {
        /** Задание №3: Вывести значение функции: (4*(x - 5)^2 + 7*x – 10)/(x^4+1).
         * x, y - Корни уравнений.
         */
        Double y = ((4 * Math.pow((x - 5), 2) + 7 * x - 10) / (Math.pow(x, 4) + 1));
        System.out.println(String.format("Задание №3: \nРешение уравнения: %.3f.", y));
    }

    public static void task_4(Double x, Double y) {
        /**
        * Задание №4: По точке (x,y) определить четверть.
         * x, y - координаты точек по осям координат.
        */
        if (x > 0 && y > 0) {
            System.out.println(String.format("Задание №4: \nТочка с координатами (%s, %s) лежит в I четверти.", x, y));
        } else {
            if (x < 0 && y > 0) {
                System.out.println(String.format("Задание №4: \nТочка с координатами (%s, %s) лежит во II четверти.", x, y));
            } else {
                if (x < 0 && y < 0) {
                    System.out.println(String.format("Задание №4: \nТочка с координатами (%s, %s) лежит в III четверти.", x, y));
                } else {
                    System.out.println(String.format("Задание №4: \nТочка с координатами (%s, %s) лежит в IV четверти.", x, y));
                }
            }
        }
    }

    public static void task_5(Double a, Double b, Double c) {
        /**
         * Задание №5*: Решить квадратное уравнение a*x^2 + b*x + c = 0 имея a,b,c ответ вывести в строку.
         * a, b - коэфициенты квадратного уравнения; с - свободный член. D - дискриминант.
         */
        System.out.println(String.format("Задание №5*:"));
        Double D = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            Double x = -c / b;
            System.out.println(String.format("x = %s.", x));
        } else {
            if (D == 0) {
                Double x = -b / (2 * a);
                System.out.println(String.format("D = %s, \n x = %s.", D, x));
            } else {
                if (D > 0) {
                    Double x1 = (-b + Math.sqrt(D)) / (2 * a);
                    Double x2 = (-b - Math.sqrt(D)) / (2 * a);
                    System.out.printf(String.format("Дискриминант: D = %s; \nКорни квадратного уравнения: x1 = %s, x2 = %s.", D, x1, x2));
                } else {
                    if (D < 0) {
                        System.out.println("Нет действительных корней");
                    }
                }
            }
        }
    }

    public static void task_6(Integer numbersOfCoins) {
        /**
         * Задание №6:
         * Закончить фразу “У меня в кармане...” одним из возможных продолжений: “n монет”, “n монета”, “n монеты” 0 <= n <= 100.
         * numbersOfCoins - число монет.
         */
        if (numbersOfCoins % 10 == 1 && (numbersOfCoins / 10) % 10 != 1) {
            System.out.println(String.format("\nЗадание №6*: \nУ меня в кармане %s монета", numbersOfCoins));
        } else {
            if ((numbersOfCoins % 10) == 0 || numbersOfCoins % 10 > 0 && (numbersOfCoins / 10) % 10 == 1 || numbersOfCoins % 10 >= 5) {
                System.out.println(String.format("\nЗадание №6*: \nУ меня в кармане %s монет", numbersOfCoins));
            } else {
                if (numbersOfCoins % 10 > 1 && numbersOfCoins % 10 < 5) {
                    System.out.println(String.format("\nЗадание №6*: \nУ меня в кармане %s монеты", numbersOfCoins));
                }
            }
        }
    }

    public static void task_7(Integer a, Integer b, Integer c) {
        /**
         * Задание №7*: Упорядочить три числа по возрастанию.
         * a, b, c - числа в произвольном порядке;
         * minValue - минимальное значение; averageValue - среднее значение, maxValue - максимальное значение.
         */
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
            System.out.println(String.format("Задание №7*: \nОтвет в порядке возрастания: %s, %s, %s.", minValue, averageValue, maxValue));
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
                System.out.println(String.format("Задание №7*: \nОтвет в порядке возрастания: %s, %s, %s.", minValue, averageValue, maxValue));
            } else {
                if (c > b && c > a) {
                    maxValue = c;
                    if (a > b) {
                        minValue = b;
                        averageValue = a;
                    } else {
                        minValue = a;
                        averageValue = b;
                    }
                    System.out.println(String.format("Задание №7*: \nОтвет в порядке возрастания: %s, %s, %s.", minValue, averageValue, maxValue));
                }
            }
        }
    }

    public static void main(String[] args) {
        task_1(10, 12, 5);
        task_2(2007);
        task_3(25);
        task_4(2.1, 4.4);
        task_5(4.0, 8.0, -5.0);
        task_6(25);
        task_7(12, 6, 9);
    }
}
