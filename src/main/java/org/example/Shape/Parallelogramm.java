package org.example.Shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parallelogramm extends Square {
    private static final Logger logger = LoggerFactory.getLogger(Parallelogramm.class);
    private Double a;
    private Double h;

    /**
     * Конструктор для длины "а" и высоты "h" параллелограмма;
     *
     * @param a - значение длины параллелограмма;
     * @param h - значение высоты параллелограмма.
     */
    public Parallelogramm(Double a, Double h) {
        super(a);
        if (a > 0 && h > 0) {
            this.a = a;
            this.h = h;
        } else {
            this.a = 0.0;
            this.h = 0.0;
        }
    }

    @Override
    public Double getA() {
        return a;
    }

    public Double getH() {
        return h;
    }

    @Override
    public Double square() {
        return a * h;
    }

    @Override
    public void PrintArea() {
        logger.info(String.format("Площадь параллелогамма: %s.", square()));
    }
}
