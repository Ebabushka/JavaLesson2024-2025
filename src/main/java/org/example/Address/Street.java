package org.example.Address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Street extends City {
    private static final Logger logger = LoggerFactory.getLogger(Street.class);
    private final String nameCountry;
    private final String nameRegion;
    private final String nameCity;
    private final String nameStreet;

    /**
     * Конструктор класса улица;
     *
     * @param nameCountry - введтие название страны;
     * @param nameRegion  - введите название региона;
     * @param nameCity    - введите название города;
     * @param nameStreet  - введите название улицы.
     */
    public Street(String nameCountry, String nameRegion, String nameCity, String nameStreet) {
        super(nameCountry, nameRegion, nameCity);
        this.nameCountry = nameCountry;
        this.nameRegion = nameRegion;
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
    }

    @Override
    public String getNameCountry() {
        return nameCountry;
    }

    @Override
    public String getNameRegion() {
        return nameRegion;
    }

    @Override
    public String getNameCity() {
        return nameCity;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    @Override
    public String address() {
        return String.format("Адрес: %s; %s; %s; %s.", nameCountry, nameRegion, nameCity, nameStreet);
    }

    @Override
    public void printAddress() {
        logger.info(address());
    }
}
