package org.example;

public class Calculate {
    /**
     * @param a - первое число;
     * @param b - второче число;
     * @return - возвращает сумму чисел a и b.
     */
    public static Double addition(Double a, Double b) {
        return a + b;
    }

    /**
     * @param a - первое число;
     * @param b - второче число;
     * @return - возвращает разность чисел a и b.
     */
    public static Double deduction(Double a, Double b) {
        return a - b;
    }

    /**
     * @param a - первое число;
     * @param b - второче число;
     * @return - возвращает произведение чисел a и b.
     */
    public static Double multiplication(Double a, Double b) {
        return a * b;
    }

    /**
     * @param a - первое число;
     * @param b - второче число;
     * @return - возвращает частное чисел a и b.
     */
    public static Double division(Double a, Double b) {
        if (b.equals(0.0)) {
            throw new DivisionByZeroError(b);
        }
        return a / b;
    }
}
