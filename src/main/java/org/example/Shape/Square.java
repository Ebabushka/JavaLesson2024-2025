package org.example.Shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape {
    private static final Logger logger = LoggerFactory.getLogger(Square.class);
    private Double a;

    /**
     * Конструктор для стороны "а" квадрата;
     * @param a - значение длины и ширины квадрата.
     */
    public Square(Double a) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 0.0;
        }
    }

    public Double getA() {
        return a;
    }

    @Override
    public Double square() {
        return a * a;
    }

    @Override
    public void PrintArea() {
        logger.info(String.format("Площадь квадрата: %s.", square()));
    }
}

