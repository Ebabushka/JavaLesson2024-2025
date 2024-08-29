package org.example.Human;

public class Cook extends Work implements MedicalBook {
    Document document;

    /**
     * Конструктор профессии Повар;
     *
     * @param document - возвращает документ повара;
     */
    public Cook(Document document) {
        this.document = document;
    }

    @Override
    public String getMedicalBook() {
        return document.toString();
    }

    @Override
    public String post() {
        return String.format("Документ: %s.", document.document());
    }
}