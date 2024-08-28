package org.example.Human;

public class Document {
    String nameDocument;
    Integer number;
    Integer series;

    public Document(String nameDocument, Integer number, Integer series) {
        this.nameDocument = nameDocument;
        this.number = number;
        this.series = series;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getSeries() {
        return series;
    }

    public String document() {
        return String.format("Наименование документа: %s; \nНомер документа: %s; \nСерия документа: %s", nameDocument, number.toString(), series.toString());
    }
}
