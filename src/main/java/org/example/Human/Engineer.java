package org.example.Human;

public class Engineer extends Work implements HigherEducation, MedicalBook {

    public Engineer(String work) {
        super(work);
    }

    @Override
    public String getHigherEducation() {
        String title = "Диплом специалиста инженера";
        Integer number = 2564;
        Integer series = 45456585;
        return String.format("Документ о высшем образовании: %s;\nНомер димплома: %s; \nСерия диплома: %s", title, number, series);
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

