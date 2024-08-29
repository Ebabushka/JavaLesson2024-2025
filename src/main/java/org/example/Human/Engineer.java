package org.example.Human;

public class Engineer extends Work implements HigherEducation {

    Document document;

    /**
     * Конструктор профессии Инжинер;
     *
     * @param document - возвращает документ инженера;
     */
    public Engineer(Document document) {
        this.document = document;
    }

    @Override
    public String getHigherEducation() {
        return document.toString();
    }

    @Override
    public String post() {
        return String.format("Документ: %s.", document.document());
    }
}

