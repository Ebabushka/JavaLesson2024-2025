package org.example.Address;

public class City extends Region {
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
        this.nameCity = nameCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    @Override
    public String address() {
        return String.format("Адрес: %s; %s; %s.", getNameCountry(), getNameRegion(), nameCity);
    }
}