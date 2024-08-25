package org.example;

import org.example.Address.*;
import org.example.Shape.*;

public class App {
    public static void main(String[] args) {
        Shape[] shape = {
                new Square(5.0),
                new Rectangle(2.5, 5.8),
                new Parallelogramm(4.8, 5.5),
                new RectangularTriangle(5.0, 2.6),
                new Circle(4.0)
        };
        for (int i = 0; i < shape.length; i++) {
            shape[i].PrintArea();
        }
        Address[] address = {
                new Country("Германия"),
                new Region("Монголия", "Хувсгел"),
                new City("Кыргызстан", "Иссык-Кульская область", "Каракол"),
                new Street("Россия", "Псковская область", "Пыталово", "ул. Шафранского")
        };
        for (int i = 0; i < address.length; i++) {
            address[i].printAddress();
        }
    }
}
