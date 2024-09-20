package org.example;

public class DivisionByZeroError extends ArithmeticException {
    public DivisionByZeroError() {
        super("Ошибка деления на 0");
    }

    public DivisionByZeroError(Double b) {
        super("Делитель равен: " + b);
    }

    public DivisionByZeroError(String s) {
        super(s);
    }
}
