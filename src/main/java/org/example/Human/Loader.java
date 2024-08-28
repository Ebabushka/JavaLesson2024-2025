package org.example.Human;

public class Loader extends Work implements HigherEducation, MedicalBook {
    public Loader(String profession) {
        super(profession);
    }

    @Override
    public String getHigherEducation() {
        return "Диплом о высшем образовании не нужен";
    }

    @Override
    public String getMedicalBook() {
        return "Медицинская книжка не требуется";
    }

    @Override
    public String post() {
        return String.format("\nПрофессия: %s; \n%s; \n%s.\n", getWork(), getHigherEducation(), getMedicalBook());
    }
}
