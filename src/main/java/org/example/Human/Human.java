package org.example.Human;

public class Human {
    private final String fullName;
    private final Integer age;
    private final String profession;
    private final Work work;

    /**
     * Конструктор ФИО и возраста человека;
     *
     * @param fullName   - введите ФИО человека;
     * @param age        - введите возраст человека;
     * @param profession - введите название профессии;
     * @param work       - введите документ.
     */
    public Human(String fullName, Integer age, String profession, Work work) {
        this.work = work;
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    /**
     * Метод отображения ФИО, возраста человека, профессии, документов;
     *
     * @return - Возвращает ФИО и возраст человека, профессию, документы.
     */
    public String human() {
        return String.format("\nФИО: %s;\nВозраст: %s; \nПрофессия: %s; \n%s\n", fullName, age, profession, work.requiredDocuments());
    }
}