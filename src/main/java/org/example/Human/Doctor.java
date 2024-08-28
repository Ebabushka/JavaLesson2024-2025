package org.example.Human;

public class Doctor extends Work implements HigherEducation, MedicalBook {
    public Doctor(String work) {
        super(work);
    }

    @Override
    public String getHigherEducation() {
        String title = "Диплом специалиста врача";
        Integer number = 2363;
        Integer series = 23632462;
        return String.format("Документ о высшем образовании: %s;\nНомер димплома: %s; \nСерия диплома: %s", title, number, series);
    }

    @Override
    public String getMedicalBook() {
        String title = "Медицинская нижка";
        Integer number = 32236236;
        return String.format("%s;\nНомер медицинской книжки №: %s", title, number);
    }

    @Override
    public String post() {
        return String.format("\nПрофессия: %s; \n%s; \n%s.\n", getWork(), getHigherEducation(), getMedicalBook());
    }
}
