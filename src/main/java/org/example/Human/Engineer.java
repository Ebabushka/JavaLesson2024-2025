package org.example.Human;

public class Engineer extends Work implements HigherEducation {

    private final Document documentHigherEducation;

    /**
     * Конструктор профессии Инжинер;
     *
     * @param documentHigherEducation - возвращает документ инженера;
     */
    public Engineer(Document documentHigherEducation) {
        this.documentHigherEducation = documentHigherEducation;
    }

    @Override
    public Document getHigherEducation() {
        return documentHigherEducation;
    }

    @Override
    public String requiredDocuments() {
        return String.format("Документ: %s.", documentHigherEducation.document());
    }
}

