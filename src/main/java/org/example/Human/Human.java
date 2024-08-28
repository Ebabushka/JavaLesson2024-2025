package org.example.Human;

public class Human {
    private final String fullName;
    private final Integer age;

    /**
     * Конструктор ФИО и возраста человека;
     * @param fullName - введите ФИО человека;
     * @param age - введите возраст человека.
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
     * @return - Возвращает ФИО и возраст человека.
     */
    public String human() {
        return String.format("\nФИО: %s;\nВозраст: %s;", fullName, age);
    }
}