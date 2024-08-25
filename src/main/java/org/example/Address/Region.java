package org.example.Address;

public class Region extends Country {
    private final String nameRegion;

    /**
     * Конструктор класса регион;
     *
     * @param nameCounty - введите название страны;
     * @param nameRegion - введите название региона.
     */
    public Region(String nameCounty, String nameRegion) {
        super(nameCounty);
        this.nameRegion = nameRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    @Override
    public String address() {
        String stapler = super.address() + " " + nameRegion;
        return String.format("%s;", stapler);
    }
}