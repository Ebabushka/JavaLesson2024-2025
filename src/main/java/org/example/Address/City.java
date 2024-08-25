package org.example.Address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class City extends Region {
    private static final Logger logger = LoggerFactory.getLogger(City.class);
    private final String nameCountry;
    private final String nameRegion;
    private final String nameCity;

    /**
     * Конструктор класса город;
     *
     * @param nameCounty - введтие название страны;
     * @param nameRegion - введите название региона;
     * @param nameCity   - введите название города.
     */
    public City(String nameCounty, String nameRegion, String nameCity) {
        super(nameCounty, nameRegion);
        this.nameCountry = nameCounty;
        this.nameRegion = nameRegion;
        this.nameCity = nameCity;
    }

    @Override
    public String getNameCountry() {
        return nameCountry;
    }

    @Override
    public String getNameRegion() {
        return nameRegion;
    }

    public String getNameCity() {
        return nameCity;
    }

    @Override
    public String address() {
        return String.format("Адрес: %s; %s; %s.", nameCountry, nameRegion, nameCity);
    }

    @Override
    public void printAddress() {
        logger.info(address());
    }
}