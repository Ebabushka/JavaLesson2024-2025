package org.example;

import java.util.Objects;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String mobileNumber;
    private String hairColor;
    private String birthCity;

    public Person(String fullName, String dateOfBirth, String mobileNumber, String hairColor, String birthCity) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
        this.hairColor = hairColor;
        this.birthCity = birthCity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return fullName.equalsIgnoreCase(person.fullName) && dateOfBirth.equals(person.dateOfBirth) && birthCity.equalsIgnoreCase(person.birthCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName.toLowerCase(), dateOfBirth.toLowerCase(), birthCity.toLowerCase());
    }

    public String String() {
        return String.format("%s, %s, %s, %s.", fullName, dateOfBirth, mobileNumber, hairColor, birthCity);
    }
}

