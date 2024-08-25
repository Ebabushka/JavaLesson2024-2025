package org.example.Address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Region extends Country {
    private static final Logger logger = LoggerFactory.getLogger(Region.class);
    private final String nameCountry;
    private final String nameRegion;

    /**
     * Конструктор класса регион;
     *
     * @param nameCounty - введите название страны;
     * @param nameRegion - введите название региона.
     */
    public Region(String nameCounty, String nameRegion) {
        super(nameCounty);
        this.nameCountry = nameCounty;
        this.nameRegion = nameRegion;
    }

    @Override
    public String getNameCountry() {
        return nameCountry;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    @Override
    public String address() {
        return String.format("Страна: %s; Регион: %s.", nameCountry, nameRegion);
    }

    @Override
    public void printAddress() {
        logger.info(address());
    }
}