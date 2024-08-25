package org.example.Address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country extends Address {
    private static final Logger logger = LoggerFactory.getLogger(Country.class);
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

    @Override
    public void printAddress() {
        logger.info(address());
    }
}
