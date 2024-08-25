package org.example.Address;

public class Street extends City {
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
        this.nameStreet = nameStreet;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    @Override
    public String address() {
        String stapler = super.address() + " " + nameStreet;
        return String.format("%s.", stapler);
    }
}
