package org.example.Human;

public class Cook extends Work implements HigherEducation, MedicalBook {
    public Cook(String work) {
        super(work);
    }

    @Override
    public String getHigherEducation() {
        return "Диплом о высшем образовании не нужен.";
    }

    @Override
    public String getMedicalBook() {
        String title = "Медицинская нижка";
        Integer number = 25648546;
        return String.format("%s;\nНомер медицинской книжки №: %s", title, number);
    }

    @Override
    public String post() {
        return String.format("\nПрофессия: %s; \n%s; \n%s.\n", getWork(), getHigherEducation(), getMedicalBook());
    }
}
