package org.example.Shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RectangularTriangle extends Rectangle {
    private static final Logger logger = LoggerFactory.getLogger(Parallelogramm.class);
    Double a;
    Double b;

    /**
     * Конструктор для сторон катетов "а" и "b" прямоугольного треугольника;
     *
     * @param a - значение катета прямоугольного треугольника;
     * @param b - значение катета прямоугольного треугольника.
     */

    public RectangularTriangle(Double a, Double b) {
        super(a, b);
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

    @Override
    public Double getB() {
        return b;
    }

    @Override
    public Double square() {
        return 0.5 * a * b;
    }

    @Override
    public void PrintArea() {
        logger.info(String.format("Площадь прямоугольного треугольника: %s.", square()));
    }
}