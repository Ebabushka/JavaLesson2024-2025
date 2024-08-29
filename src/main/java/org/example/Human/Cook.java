package org.example.Human;

public class Cook extends Work implements MedicalBook {
    private final Document documentMedicalBook;

    /**
     * Конструктор профессии Повар;
     *
     * @param documentMedicalBook - возвращает документ повара;
     */
    public Cook(Document documentMedicalBook) {
        this.documentMedicalBook = documentMedicalBook;
    }

    @Override
    public Document getMedicalBook() {
        return documentMedicalBook;
    }

    @Override
    public String requiredDocuments() {
        return String.format("Документ: %s.", documentMedicalBook.document());
    }
}