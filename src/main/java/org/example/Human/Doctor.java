package org.example.Human;

public class Doctor extends Work implements HigherEducation, MedicalBook {
    Document document1;
    Document document2;

    /**
     * Конструктор профессии Доктора;
     *
     * @param document1 - возвращает документ Врачаа №1;
     * @param document2 - возвращает документ Врачаа №2.
     */
    public Doctor(Document document1, Document document2) {
        this.document1 = document1;
        this.document2 = document2;
    }

    @Override
    public String getHigherEducation() {
        return document1.toString();
    }

    @Override
    public String getMedicalBook() {
        return document2.toString();
    }

    @Override
    public String post() {
        return String.format("Документ #1: %s\nДокумент #2: %s.", document1.document(), document2.document());
    }
}
