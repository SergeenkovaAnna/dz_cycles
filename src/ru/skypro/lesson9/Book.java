package ru.skypro.lesson9;

public class Book {

    private int publishingYear;
    private final String title;


    public Book(String title, int publishingYear) {
        this.title=title;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }


    public int getPublishingYear() {
        return this.publishingYear;
    }

    public int setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
        return publishingYear;
    }

    public String toString() {
        return "Название: " + getTitle() + ";" + " Год издания:" + getPublishingYear();
    }

}
