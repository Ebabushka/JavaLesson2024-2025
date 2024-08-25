package org.example.Shape;

public class Rectangle extends Square {
    private Double b;

    /**
     * Конструктор для сторон "а" и "b" прямоугольника;
     *
     * @param a - значение длины прямоугольника;
     * @param b - значение ширины прямоугольника.
     */
    public Rectangle(Double a, Double b) {
        super(a);
        if (b > 0) {
            this.b = b;
        } else {
            this.b = 0.0;
        }
    }

    public Double getB() {
        return b;
    }

    @Override
    public String square() {
        Double decision = getA() * b;
        return String.format("Площадь прямоугольника: %s;", decision);
    }
}
