package org.example.Shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Square {
    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);
    private Double a;
    private Double b;

    /**
     * Конструктор для сторон "а" и "b" прямоугольника;
     *
     * @param a - значение длины прямоугольника;
     * @param b - значение ширины прямоугольника.
     */
    public Rectangle(Double a, Double b) {
        super(a);
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
        } else {
            this.a = 0.0;
            this.b = 0.0;
        }
    }

    @Override
    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    @Override
    public Double square() {
        return a * b;
    }

    @Override
    public void PrintArea() {
        logger.info(String.format("Площадь прямоугольника: %s.", square()));
    }
}
