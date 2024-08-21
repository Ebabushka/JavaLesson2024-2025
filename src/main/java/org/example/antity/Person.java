package org.example.antity;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private String middleName;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    private String citizenship;
    private String gender;
    private Double height;
    private Double weight;

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Мужской") || gender.equals("Женский")) {
            this.gender = gender;
        } else {
            this.gender = String.format("Вы ебаный мудак(чка)");
        }
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        Double minHeight = 0.48;
        Double maxHeight = 2.72;
        if (minHeight <= height && height <= maxHeight) {
            this.height = height;
        } else {
            this.height = 0.0;
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        Double minWeight = 2.5;
        Double maxWeight = 610.0;
        if (minWeight <= weight && weight <= maxWeight) {
            this.weight = weight;
        } else {
            this.weight = 0.0;
        }
    }
    public int age() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }
}


