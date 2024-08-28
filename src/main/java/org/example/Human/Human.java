package org.example.Human;

public class Human {
    private final String fullName;
    private final Integer age;
    Engineer engineer = new Engineer("Инжинер");
    Cook cook = new Cook("Повар");
    Doctor doctor = new Doctor("Врач");
    Loader loader = new Loader("Грузчик");

    /**
     * Конструктор ФИО и возраста человека;
     *
     * @param fullName - введите ФИО человека;
     * @param age      - введите возраст человека.
     */
    public Human(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    /**
     * Метод отображения ФИО и возраста человека;
     *
     * @return - Возвращает ФИО и возраст человека.
     */
    public String human1() {
        return String.format("\nФИО: %s;\nВозраст: %s; %s", fullName, age, engineer.post());
    }

    public String human2() {
        return String.format("\nФИО: %s;\nВозраст: %s; %s", fullName, age, cook.post());
    }

    public String human3() {
        return String.format("\nФИО: %s;\nВозраст: %s; %s", fullName, age, doctor.post());
    }

    public String human4() {
        return String.format("\nФИО: %s;\nВозраст: %s; %s", fullName, age, loader.post());
    }
}