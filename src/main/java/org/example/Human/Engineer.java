package org.example.Human;

public class Engineer extends Work implements HigherEducation, MedicalBook {
    public Engineer(String work) {
        super(work);
    }

    @Override
    public String getHigherEducation() {
        return "Требуется документ о высшем образовании";
    }

    Document document = new Document("Диплом о высшем образовании Инжинера", 2459, 456985);

    @Override
    public String getMedicalBook() {
        return "Медицинская книжка не требуется";
    }

    @Override
    public String post() {
        return String.format("\nПрофессия: %s; \n%s: \n%s; \n%s.\n", getWork(), getHigherEducation(),document.document(), getMedicalBook());
    }
}

