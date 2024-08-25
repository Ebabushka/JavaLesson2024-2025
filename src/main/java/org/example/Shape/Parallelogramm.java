package org.example.Shape;

public class Parallelogramm extends Square {
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
            this.h = h;
        } else {
            this.h = 0.0;
        }
    }

    public Double getH() {
        return h;
    }

    @Override
    public String square() {
        return String.format("Площадь параллелограмма: %s;", getA() * h);
    }
}
