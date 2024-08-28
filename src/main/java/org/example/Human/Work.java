package org.example.Human;

public abstract class Work {
    private final String work;

    /**
     * Конструктор профессии;
     * @param profession - введите професию.
     */
    public Work(String profession) {
        this.work = profession;
    }

    public String getWork() {
        return work;
    }

    /**
     * Выводит введенную профессию;
     * @return - возвращает профессию.
     */
    public String post() {
        return " ";
    }
}
