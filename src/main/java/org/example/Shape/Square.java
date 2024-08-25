package org.example.Shape;

public class Square extends Shape {
    private Double a;

    /**
     * Конструктор для стороны "а" квадрата;
     *
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
    public String square() {
        return String.format("Площадь квадрата: %s;", (a * a));
    }
}

