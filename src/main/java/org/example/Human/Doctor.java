package org.example.Human;

public class Doctor extends Work implements HigherEducation, MedicalBook {
    public Doctor(String work) {
        super(work);
    }

    @Override
    public String getHigherEducation() {
        return "Требуется документ о высшем образовании";
    }

    Document document1 = new Document("Диплом о высшем образовании терапевта", 2368, 876521);

    @Override
    public String getMedicalBook() {
        return "Требуется медицинская книжка";
    }

    Document document2 = new Document("Медицинская книжка", 2489, 547936);

    @Override
    public String post() {
        return String.format("\nПрофессия: %s; \n%s: \n%s; \n%s: \n%s. \n", getWork(), getHigherEducation(), document1.document(),
        getMedicalBook(), document2.document());
    }
}
