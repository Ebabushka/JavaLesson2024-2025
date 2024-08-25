package org.example.Shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {
    private static final Logger logger = LoggerFactory.getLogger(Parallelogramm.class);
    private Double r;

    /**
     * Конструктор для радиуса "r" круга;
     *
     * @param r - значение радиуса круга.
     */
    public Circle(Double r) {
        if (r > 0) {
            this.r = r;
        } else {
            this.r = 0.0;
        }
    }

    public Double getR() {
        return r;
    }

    public Double square() {
        return 3.1415 * r * r;
    }

    @Override
    public void PrintArea() {
        logger.info(String.format("Площадь круга: %s.", square()));
    }
}
