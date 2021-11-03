package ru.skypro.lesson9;

public class Book {

    int publishingYear;

    public Book(int publishingYear) {

        this.publishingYear = publishingYear;
    }


    public int getPublishingYear() {
        return this.publishingYear;
    }

    public int setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
        return publishingYear;
    }

}
