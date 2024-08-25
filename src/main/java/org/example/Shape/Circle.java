package org.example.Shape;

public class Circle extends Shape {
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

    public String square() {
        Double decision = 3.1415 * r * r;
        return String.format("Площадь круга: %s.", decision);
    }
}
