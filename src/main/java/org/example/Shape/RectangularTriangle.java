package org.example.Shape;

public class RectangularTriangle extends Rectangle {
    /**
     * Конструктор для сторон катетов "а" и "b" прямоугольного треугольника;
     *
     * @param a - значение катета прямоугольного треугольника;
     * @param b - значение катета прямоугольного треугольника.
     */

    public RectangularTriangle(Double a, Double b) {
        super(a, b);
    }

    @Override
    public String square() {
        return String.format("Площадь прямоугольного треугольника: %s;", (0.5 * getA() * getB()));
    }
}