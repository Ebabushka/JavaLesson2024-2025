package org.example.Human;

public class Cook extends Work implements HigherEducation, MedicalBook {
    public Cook(String work) {
        super(work);
    }

    @Override
    public String getHigherEducation() {
        return "Документ о высшем образовании не требуется";
    }

    @Override
    public String getMedicalBook() {
        return "Требуется медицинская книжка";
    }

    Document document = new Document("Медицинская книжка", 5687, 235987);

    @Override
    public String post() {
        return String.format("\nПрофессия: %s; \n%s; \n%s: \n%s.\n", getWork(), getHigherEducation(), getMedicalBook(), document.document());
    }
}