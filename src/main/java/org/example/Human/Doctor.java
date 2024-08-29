package org.example.Human;

public class Doctor extends Work implements HigherEducation, MedicalBook {
    private final Document documentHigherEducation;
    private final Document documentMedicalBook;

    /**
     * Конструктор профессии Доктора;
     *
     * @param documentHigherEducation - возвращает документ Врачаа №1;
     * @param document2 - возвращает документ Врачаа №2.
     */
    public Doctor(Document documentHigherEducation, Document documentMedicalBook) {
        this.documentHigherEducation = documentHigherEducation;
        this.documentMedicalBook = documentMedicalBook;
    }

    @Override
    public Document getHigherEducation() {
        return documentMedicalBook;
    }

    @Override
    public Document getMedicalBook() {
        return documentMedicalBook;
    }

    @Override
    public String requiredDocuments() {
        return String.format("Документ #1: %s\nДокумент #2: %s.", documentHigherEducation.document(), documentMedicalBook.document());
    }
}
