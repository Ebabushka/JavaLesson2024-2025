package org.example.Address;

public class Country extends Address {
    private final String nameCountry;

    /**
     * Конструктор класса страна;
     *
     * @param nameCountry - введите название страны.
     */
    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    @Override
    public String address() {
        return String.format("Страна: %s.", nameCountry);
    }
}
